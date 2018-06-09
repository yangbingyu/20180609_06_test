/**
 * Created by dell on 2018/6/9.
 */
public class Account {
    private long id;
    private String pwd;
    private String name;
    private String personId;
    private String email;
    double balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean withdraw(double money){
        if (money>balance){
            System.out.println("余额不足，要取"+money+",实际只有"+balance);
            return false;
        }
        balance-=money;
        System.out.println("取款成功，余额为"+balance);
        return true;
    }
    public void desposit(double money){
        balance+=money;
        System.out.println("存款成功,存入了"+money+",余额为"+balance);
    }
}
