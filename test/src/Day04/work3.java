package Day04;

import java.util.Random;
import java.util.Scanner;
/**
 * 项目三：猜拳游戏（积分）
 * rock paper scissors
 * 功能：
 * 询问是否开始游戏（Y/N）
 * 询问下注积分，总积分10000
 * 输入石头/剪刀/布 或 1/2/3
 * 电脑随机生成 石头/剪刀/布
 * 进行结果比对 玩家胜利 下注积分*2 电脑胜利 玩家失去积分 平局 返还下注积分
 * 执行1操作
 * 例子： 是否开始游戏（Y/N）
 * Y
 * 请输入下注积分
 * 500
 * 请您出拳 石头/剪刀/布 或 1/2/3
 * 石头
 * 玩家 ： 石头
 * 电脑 ： 布
 * 电脑win
 * 您的积分9500
 * 是否开始游戏（Y/N）
 * @author Asus
 *
 */
public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		play(sc,r);
	}

	public static void play(Scanner sc, Random r) {
		// TODO Auto-generated method stub
		int score = 10000;
		String[] rock = {"石头","剪刀","布"};
		while(true) {
			//初始化
			
			//1.控制台询问是否开始游戏
			System.out.println("是否开始游戏（Y/N）");
			String s = sc.next();
			if(s.equalsIgnoreCase("N")) {
				System.out.println("游戏结束");
				return;
			}else {
				// * 电脑随机生成 石头/剪刀/布
				int com_chance = r.nextInt(3)+1;
				System.out.println("请输入要下注的积分");
				int my_score = num_check(sc, score);
				System.out.println("请您出拳 ：1.石头2.剪刀3.布");
				int my_change = num_check(sc, 3);
				System.out.println("玩家:"+rock[my_change-1]);
				System.out.println("电脑："+rock[com_chance-1]);
				
				
				switch(paper(my_change,com_chance)) {
					case 1:
						System.out.println("玩家win");
						score+=my_score;
						System.out.println("您的积分："+score);
						break;
					case 0:
						System.out.println("平局");
						System.out.println("您的积分："+score);
						break;
					case -1:
						System.out.println("电脑win");
						score-=my_score;
						System.out.println("您的积分："+score);
						break;
				}
				
				
				if(score==0) {
					System.out.println("您的积分不足，请联系管理员充值");
					return;
				}
				/**
				 * 执行1;
				 */
				System.out.println("是否继续游戏（Y/N）");
				s = sc.next();
				if(s.equalsIgnoreCase("N")) {
					System.out.println("游戏结束");
					return;
				}
			}
		}
	}
	
	/**
	 * 猜拳
	 * @param my  我的
	 * @param com  电脑
	 * @return  1为赢,0为平局，2为输
	 */
	public static int paper(int my,int com) {
		if(my<com||my==3&&com==1) {
			return 1;
		}
		if(my>com||my==1&&com==3) {
			return -1;
		}
		return 0;
	}
	/**
	 * 数字验证
	 * @param sc   获取输入对象
	 * @param max  数字范围：默认最小为1，数字最大是max
	 * @return 
	 */
	public static int num_check(Scanner sc,int max) {
		int data;
		while (true) {
			try {
				data=sc.nextInt();
				if (data>=1&&data<=max) {
					return data;
				}
				else
					System.out.println("请录入1-"+max+"的整数");
			} catch (Exception e) {
				// TODO: handle exception
				//接收数据
				System.out.println("请检查格式");
				sc.next();
			}
		}
	}
}

