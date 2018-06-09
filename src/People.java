/**
 * Created by dell on 2018/6/9.
 */
public class People {
    String name=null;
    int age=0;
    String sex=null;
    double tall=0;
    public People(String name, int age, String sex, double tall){
        super();
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.tall=tall;
    }
    public void speak(String hua){
        System.out.println(name+"正在说"+hua);
    }
    public double getSum(double a,double b){
        System.out.println(a+"+"+b+"="+(a+b));
        return a+b;
    }
    public String changeName(String name){
        this.name=name;
        System.out.println("修改后的名字为："+name);
        return name;
    }
}
