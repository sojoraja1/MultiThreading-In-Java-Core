package concepts;
/*
 * @author: Sundar Gautam
 * @create date: 9/11/2020
 */

public class Synchronization {


    public static void main(String[] args) {

        Account account = new Account();
        Husband husband = new Husband(account);
        Wife wife = new Wife(account);
        husband.start();
        wife.start();
    }
}

class Account{
    int accountBalance =1000;
    static int accountBalance1 =900;
   synchronized  void buySomething(String goods,int price) throws InterruptedException{
        System.out.println("Payment for "+goods);
        Thread.sleep(3000);
        this.accountBalance=this.accountBalance-price;
        Thread.sleep(1000);
        System.out.println("After payment of " + goods +"with"+price+"money left in bank::" + accountBalance);

    }
    synchronized static void buySomethings(String goods,int price) throws InterruptedException{
        System.out.println("Payment for "+goods);
        Thread.sleep(3000);
        accountBalance1=accountBalance1-price;
        Thread.sleep(1000);
        System.out.println("After payment of " + goods +"with"+price+"money left in bank::" + accountBalance1);

    }
    synchronized static void buySomethings1 (String goods,int price) throws InterruptedException{
        System.out.println("Payment for "+goods);
        Thread.sleep(3000);
        accountBalance1=accountBalance1-price;
        Thread.sleep(1000);
        System.out.println("After static buysomthings payment of " + goods +"with"+price+"money left in bank::" + accountBalance1);

    }

}

class Husband extends Thread{

    Account account;
    Husband(Account account){
        this.account = account;
    }

    @Override
    public void run(){
     try {
         account.buySomething("Ruslan",1000);
         Account.buySomethings1("dsfdsf",2000);
     }catch (Exception e){

         System.out.println("Opps");
     }
    }

}

class Wife extends Thread{
    Account account;
    Wife(Account account){
        this.account = account;
    }
    @Override
    public void run(){
        try {
            account.buySomething("Dsfsdfsfaaaaaaaaaa",10000);
         Account.buySomethings("ProductName",900);
        }catch (Exception e){

            System.out.println("Opps");
        }
    }
}
