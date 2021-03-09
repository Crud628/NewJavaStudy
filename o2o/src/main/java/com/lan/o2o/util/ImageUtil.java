package com.lan.o2o.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lan.o2o.web.superadmin.AreaController;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	
	private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);
	/**
	 * 获取当前线程的路径
	 */
	private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	/**
	 * 日期格式
	 */
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	
	/**
	 * 随机数
	 */
	private static final Random r = new Random();
	
	
	/**
	 * 店家缩略图  商品缩略图处理
	 * 由于图片可能重名，添加随机后缀
	 * @param thumbnail
	 * @param targetAddr
	 * @return
	 */
	public static String generateThumbnail(InputStream thumbnailInputStream, String fileName ,String targetAddr) {
		String realFileName = getRandomFileName();
		String extension = getFileExtension(fileName);
		makeDirPath(targetAddr);
		String relativeAddr = targetAddr + realFileName + extension;
		logger.debug("current relativeAddr is:" + relativeAddr);
		File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
		logger.debug("current complete addr is" + PathUtil.getImgBasePath() + relativeAddr);
		logger.debug("basePath is:" + basePath);
		try {
			Thumbnails.of(thumbnailInputStream).size(200, 200)
						.watermark(Positions.BOTTOM_RIGHT
								,ImageIO.read(new File(basePath + "/watermark.png")),0.25f)
						.outputQuality(0.8f)
						.toFile(dest);
		}catch(IOException e){
			logger.error(e.toString());
			e.printStackTrace();
		}
		return relativeAddr;
	}
	
	/**
	 * 创建目标路径所涉及道德目录，即/home/work/xiangze/xxx.jpg,
	 * 那么home work xiangze 这三个文件夹得自动创建
	 * @param targetAddr
	 */
	private static void makeDirPath(String targetAddr) {
		// TODO Auto-generated method stub
		String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
		File dirPath = new File(realFileParentPath);
		if(!dirPath.exists()) {
			dirPath.mkdirs();
		}
	}
	/**
	 * 获取输入文件流的扩展名
	 * @param thumbnail
	 * @return
	 */
	private static String getFileExtension(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}

	/**
	 * 生成随机文件名，当前年月日小时分钟秒+五位随机数
	 * @return
	 */
	public static String getRandomFileName() {
		// 获取随机五位数
		int rannum = r.nextInt(89999)+10000;
		String nowTimeStr = sDateFormat.format(new Date());
		return nowTimeStr + rannum;
	}
	
	
	/**
	 * storePath是文件的路径还是目录路径
	 * 如果是文件路径则删除该文件
	 * 如果是目录路径则删除改目录下的所有文件
	 * @param storePath
	 */
	public static void deleteFileOrPath(String storePath) {
		File fileOrPath = new File(PathUtil.getImgBasePath() + storePath);
		if(fileOrPath.exists()) {
			if(fileOrPath.isDirectory()) {
				File files[] = fileOrPath.listFiles();
				for (int i = 0; i < files.length; i++) {
					files[i].delete();
				}
			}
			fileOrPath.delete();
		}
	}

}
