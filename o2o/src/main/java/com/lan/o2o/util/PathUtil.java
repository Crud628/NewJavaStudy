package com.lan.o2o.util;

/**
 * 根据环境不同，提供不同的路径
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年3月6日下午1:38:09
 */
public class PathUtil {
	//根据不同系统，获得不同分隔符   "/"  还是  "\"
	private static String seperator = System.getProperty("file.separator");
	
	/**
	 * 根据不同系统
	 * @return  项目图片根路径
	 */
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if(os.toLowerCase().startsWith("win")) {
			basePath = "E:\\projectdev\\img\\";  //根据预算，选择路径。选择项目以外的盘符防止被删除。
		}else {
			basePath = "/home/xiangze/image/";
		}
		basePath = basePath.replace("/", seperator);
		
		return basePath;
	}
	
	/**
	 * 
	 * @param shopId  商店Id
	 * @return  项目图片子路径
	 */
	public static String getShopImagePath(long shopId) {
		StringBuilder shopImagePathBuilder = new StringBuilder();
		shopImagePathBuilder.append("/upload/images/item/shop/");
		shopImagePathBuilder.append(shopId);
		shopImagePathBuilder.append("/");
		String shopImagePath = shopImagePathBuilder.toString().replace("/",seperator);
		return shopImagePath;
	}
	
	
}
