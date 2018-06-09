/**
 * Created by dell on 2018/6/9.
 */

/**
 * 创建一个Point类，有成员变量x，y，方法getX(),setX()，还有一个构造方法初始化x和y。创建类主类A来测试它。
 */
public class Test4 {
    public static void main(String[] args) {
        Point po=new Point(5,6);
        System.out.println("原始大小\tx="+po.getX()+"\ty="+po.getY());

        po.setY(8);
        po.setX(2);
        System.out.println("修改后的大小\tx="+po.getX()+"\ty="+po.getY());


    }
}
