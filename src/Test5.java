/**
 * Created by dell on 2018/6/9.
 */

/**
 *需求： 使用java描述一个车与修车厂两个事物，
 车具备的属性:轮子数、 名字、 颜色 ，还具备跑的功能行为。跑之前要检测轮子是否少于了4个，如果少于了4个，那么要送到修车厂修理，修车厂修理之后，车的轮子数要补回来4个。
 修车厂具备属性： 名字、 地址、 电话。行为： 修车。
 */

public class Test5 {
    public static void main(String[] args) {
        Car car=new Car();
        car.wheelnum=3;
        car.run();
        System.out.println(car.wheelnum);
    }
}
