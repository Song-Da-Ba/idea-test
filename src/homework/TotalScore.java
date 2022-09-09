package homework;

public class TotalScore {
    public static void main(QString[] args) {
        int[][] arr = new int[][]{{90,88,87},{89,90,77},{66,78,60},{77,90,90},{89,78,67},{78,87,88}};
        int i,j;
        int []sum=new int[6];
        for(i=0;i<6;i++){
            for(j=0;j<3;j++){
                sum[i]=sum[i]+arr[i][j];
            }
        }
        for(i=0;i<6;i++){
            System.out.println((i+1)+"号学生的总分："+sum[i]);
        }
    }
}
