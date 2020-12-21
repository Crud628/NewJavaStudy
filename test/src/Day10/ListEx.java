package Day10;

//extra: 
//一个国家的海关给每个进入该国的人一个编号，该编号从1开始依次自增。
//定期组织抽奖活动，编号为 只有 3，5，7的倍数 就能获奖
//前10个获奖编号为 
//3,5,7,9,15,21,25,27,35,45        	 
//有一个中奖号码为 59084709587505 计算 该中奖号码为 第几个中奖号码
public class ListEx {
	public static void main(String[] args) {
		long MAX =  59084709587505l;
		int count = 0;
		for ( long i = 0; Math.pow(3,i) < MAX; ++i)
			for ( long j = 0; Math.pow(5,j) < MAX; ++j)
				for ( long k = 0; Math.pow(7,k) < MAX; ++k)
					if (Math.pow(3,i) * Math.pow(5,j) * Math.pow (7,k) < MAX )
						count ++;
		System.out.println(count);																																																																																																														
	}
}
