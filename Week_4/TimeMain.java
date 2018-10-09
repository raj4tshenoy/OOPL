import java.util.*;

class Time{
  int hours, mins, sec;
  Scanner in = new Scanner(System.in);
  
  Time(){
    System.out.println("Constructor for object 1.");
    System.out.print("Enter hours, minutes and seconds: ");
    hours = in.nextInt();
    mins = in.nextInt();
    sec = in.nextInt();
  }
  Time(int hours, int mins, int sec){
    System.out.println("Constructor for object 2.");
    this.hours = hours;
    this.mins = mins;
    this.sec = sec;
  }

  void display(Time obj){
    System.out.println("Entered time is: ");
    System.out.print(obj.hours+":"+obj.mins+":"+obj.sec);
  }
}

class TimeMain{
  public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = new Time(10,20,30);
    System.out.println("\n\nDISPLAY t1\n");
    t1.display(t1);
    System.out.println("\n\nDISPLAY t2\n");
    t2.display(t2);
    System.out.println();
  }
}
