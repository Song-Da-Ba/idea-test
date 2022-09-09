package homework;

public class QString {
    public static void main(String[] args) {

        String str = "slx";
        String ss = "slxljwwdslxljwwdslxljwwd";
        int count = 0;
        for (int i = 0; i < ss.length(); i++) {
            //比较字符串A中截取
            for (int j = i; j <= ss.length(); j++) {
                if (ss.substring(i, j).equals(str))
                    count++;
            }
        }
        System.out.println("字符串" + str + "出现了" + count + "次");
    }
}