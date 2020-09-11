package concepts;
/*
 * @author: Sundar Gautam
 * @create date: 9/11/2020
 */

/*

Let T3 and T4 be two threads.Then ,
if T4 will wait until T3 completes in such case T3.join() method is executed.


If T3.join(100) //time in millisecond

Sleep: If join method is called without any waiting time,then despite of sleep inside thread,T4 won't continue till
T3 finish


 */
public class SleepJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        thread3.start();
        thread3.join(4000);
        thread4.start();
        thread4.join();
      /*
        Thread.currentThread().join();
        never do this.Since main Thread will continue onlf if main thread ended.THtat means this lead
        to infinite loop or deadlock
       */
        for (int i=0; i<10;i++){
            System.out.println("Hello i am Main Thread"+ i);
        }
    }
}
class Thread3 extends Thread{

    @Override
    public void run(){
        for (int i=0; i<10;i++){
            System.out.println("Hello i am thread3"+ i);
try {
    Thread.sleep(2000);

}catch(InterruptedException interruptedException){

    System.out.println("Exception");
}
        }
    }
}

class Thread4 extends Thread{

    @Override
    public void run(){

        for (int i=0; i<10;i++){
            System.out.println("Hello i am thread4"+ i);
        }
    }
}
