/**
 * Created by dell on 2018/6/9.
 */

/**
 * 定义一个类用来存储时间
 成员：
 时、分、秒
 方法：
 getTime
 addSecond
 addMinute
 addHour
 */
public class Test7 {
    public static void main(String[] args) {
        Mytime mytime=new Mytime();
        mytime.hour=16;
        mytime.minute=45;
        mytime.second=59;
        System.out.println(mytime.getTime());
        mytime.addSecond(10);
        System.out.println(mytime.getTime());
    }
}
