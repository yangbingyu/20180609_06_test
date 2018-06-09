/**
 * Created by dell on 2018/6/9.
 */
public class Triangel {
    double sum=0;
    public double getSum(double a,double b,double c){
        if (a+b>c&&a+c>b&&b+c>a){
            sum=a+b+c;
            return sum;
        }else {
            System.out.println("不是三角形");
            return sum;
        }

    }
}
