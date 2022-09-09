package homework;
import java.util.*;
public class FinalTest2 {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        System.out.println("请输入一个数据的长度");
        int L = data.nextInt();
        System.out.println("输入数据，以空格分隔");
        int[] arr = new int[L];
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = data.nextInt();
        }
        /*for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
