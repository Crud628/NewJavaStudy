package Day2;

public class case6 {
	public static void main(String[] args) {
        int row = 7;
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++){
            for(int j = 0;j<= i;j++){
                if (j==0 || j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
	}
}
