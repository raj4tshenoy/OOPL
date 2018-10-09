import java.util.*;

interface Series{
  int getNext();
  void reset();
  void setStart(int x);
}

class ByTwos implements Series {

int start;
  int val;

  ByTwos() {
    start = 0;
    val = 0;
  }

  public int getNext() {
    val += 2;
    return val;
  }

  public void reset() {
    val = start;
  }

  public void setStart(int x) {
    start = x;
    val = x;
  }
 
}

class Q4{
  public static void main(String[] args) {
    ByTwos ob = new ByTwos();
    Scanner in = new Scanner(System.in);
    for(int i=0; i < 5; i++)
      System.out.println("Next value is " + ob.getNext());

    System.out.println("\nResetting");
    ob.reset();
    for(int i=0; i < 5; i++)
      System.out.println("Next value is " + ob.getNext());

    System.out.println("\nEnter start: ");
    int n = in.nextInt();
    System.out.println("\nStarting at "+n);
    ob.setStart(n);
    for(int i=0; i < 5; i++)
      System.out.println("Next value is " + ob.getNext());
   
  }
}

