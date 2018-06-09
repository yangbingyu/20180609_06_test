/**
 * Created by dell on 2018/6/9.
 */
public class Mytime {
    int hour;
    int minute;
    int second;
    public  String getTime(){
        return hour+":"+minute+":"+second;
    }
    public void addSecond(int second){
        if(this.second+second>60){
            this.second+=(second-60);
            if (this.minute+1>60){
                this.minute=0;
                this.hour++;
            }else {
                this.minute++;
            }
        }else {
            this.second+=second;
        }
    }
}
