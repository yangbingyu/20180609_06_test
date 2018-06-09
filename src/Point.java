/**
 * Created by dell on 2018/6/9.
 */
public class Point {
    private int x;
    private int y;

    //构造方法
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }


    //成员方法
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
