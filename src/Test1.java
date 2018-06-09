import java.util.Scanner;

/**
 * Created by dell on 2018/6/9.
 */

/**
 * 创建一个三角形类，成员变量三边，方法求周长，创建类主类A来测试它。
 */
public class Test1 {
    public static void main(String[] args) {
        Triangel triangel=new Triangel();
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入三条边的长度");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        System.out.println(triangel.getSum(a,b,c));
    }

}
