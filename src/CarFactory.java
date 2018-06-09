/**
 * Created by dell on 2018/6/9.
 */
public class CarFactory {
    String name;
    String address ;
    String tel;

    public void repair(Car car){
        System.out.println("乒乒乓乓修车");
            car.wheelnum=4;
        System.out.println("修好了~");
        }
}
