/**
 * Created by dell on 2018/6/9.
 */
public class Car {
    String name ;
    String color;
    int wheelnum;

    public void run(){
        if (wheelnum<4){
            CarFactory carFactory=new CarFactory();
            carFactory.name="老王修车厂";
            carFactory.address="主楼广场";
            carFactory.repair(this);
        }
        System.out.println("哒哒哒~~");
    }


}
