/**
 * Created by dell on 2018/6/9.
 */
public class Jidongche {
    private String chepaino;
    private int speed;
    private double weight;
    Jidongche(){
        chepaino="XX1234";
        speed=100;
        weight=100;
    }
    public Jidongche(String chepaino, int speed, double weight){
       this.chepaino=chepaino;
       this.speed=speed;
       this.weight=weight;
    }
    public void addSpeed() {
        speed++;
    }
    public void jianSpeed(){
        speed--;
    }
    public void setChepai(String chepai){
        chepaino=chepai;
    }

    public String getChepaino() {
        return chepaino;
    }

    public void setChepaino(String chepaino) {
        this.chepaino = chepaino;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
