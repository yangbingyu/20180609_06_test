/**
 * Created by dell on 2018/6/9.
 */

/**
 * 写一个账户类(Account), 
 属性:  
 id:账户号码 长整数 
 password:账户密码 
 name:真实姓名 
 personId:身份证号码 字符串类型 
 email:客户的电子邮箱 
 balance:账户余额 
 方法: 
 deposit: 存款方法,参数是double型的金额 
 withdraw:取款方法,参数是double型的金额
 并写测试类测试
 */
public class Test6 {
    public static void main(String[] args) {
        Account account=new Account();
        account.setBalance(1000);
        account.desposit(1000);
        account.withdraw(100);
    }
}
