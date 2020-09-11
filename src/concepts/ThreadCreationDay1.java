package concepts;
/*
 * @author: Sundar Gautam
 * @create date: 9/11/2020
 */

public class ThreadCreationDay1 {
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