import java.util.*;


class Q4 extends Thread{
  public static void main(String[] args) {
    Q4 t1 = new Q4();
    Q4 t2 = new Q4();
    Q4 t3 = new Q4();
    Q4 t4 = new Q4();

    System.out.println("Default Priorities: ");
    System.out.println("t1: "+t1.getPriority()+" t2: "+t2.getPriority()+" t3: "+t3.getPriority()+" t4: "+t4.getPriority());
    t1.setPriority(6);
    t2.setPriority(7);
    t3.setPriority(8);
    t4.setPriority(9);
    System.out.println("New Priorities: ");
    System.out.println("t1: "+t1.getPriority()+" t2: "+t2.getPriority()+" t3: "+t3.getPriority()+" t4: "+t4.getPriority());
    // Main thread 
    System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
  
    // Main thread priority is set to 10 
    Thread.currentThread().setPriority(10); 
    System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority());
  }
}