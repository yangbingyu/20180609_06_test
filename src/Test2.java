/**
 * Created by dell on 2018/6/9.
 */

/**
 * 按要求编写Java应用程序。
 （1）创建一个叫做People的类：
 属性：姓名、年龄、性别、身高
 行为：说话、计算加法、改名
 编写能为所有属性赋值的构造方法；
 （2）创建主类：
 创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
 让该对象调用成员方法：
 说出“你好！”
 计算23+45的值
 将名字改为“李四”

 */
public class Test2 {
    public static void main(String[] args) {
        People people=new People("张三",18,"男",1.80);
        people.speak("你好");
        people.getSum(23,45);
        people.changeName("李四");
    }
}
