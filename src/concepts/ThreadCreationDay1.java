package concepts;
/*
 * @author: Sundar Gautam
 * @create date: 9/11/2020
 */

public class ThreadCreationDay1 {


    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();//created extending Thread
        Thread2 thread2 = new Thread2();//implementing Runnable
        Thread thread = new Thread(thread2);
        thread1.start();
        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        for (int i=0;i<10;i++){
            System.out.println("Main:"+i);
            Thread.yield();
        }
    }
}



/*
In this example we are just trying to create a Thread using two methods namely:
-By extending Thread
-By Implementing Runnable

  Q.which is better extends or implementing Runnable???
  => Here Implementing Runnable is best approach since we are able to achieve power of inheritance.
  Why???
  => Let Thread1 extends Thread,then Thread1 won't be able to extend other classess that might contain other abstraction
  
 */

class Thread1 extends Thread{

    @Override
    public void run(){

        for (int i=0;i<10;i++){
            System.out.println("Thread1:"+i);
        }
    }

}

class Thread2 implements Runnable{


    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Thread2:"+i);
        }
    }
}

