import java.util.*;

class Time{
  int hours, mins, sec;
  Scanner in = new Scanner(System.in);
  Time initialize(Time obj){
    System.out.print("Enter hours: ");
    obj.hours = in.nextInt();
    System.out.print("Enter minutes: ");
    obj.mins = in.nextInt();
    System.out.print("Enter seconds: ");
    obj.sec = in.nextInt();
    return obj;
  }
  void display(Time obj){
    System.out.print(obj.hours+":"+obj.mins+":"+obj.sec);
  }
  Time add(Time o1, Time o2){
    Time sum = new Time();
    sum.hours = o1.hours + o2.hours;
    sum.mins = o1.mins + o2.mins;
    while(sum.mins>59){ //check minutes
      ++sum.hours; sum.mins-=60;
    }
    sum.sec = o1.sec + o2.sec;
    while(sum.sec>59){ //check seconds
      ++sum.mins; sum.sec-=60;
    }
    return sum;
  }
  Time subtract(Time o1, Time o2){
    Time diff = new Time();
    diff.hours = o2.hours - o1.hours;
    if(o2.mins<o1.mins){ //borrow from hours
      o2.mins+=60; --o2.hours;
    }
    diff.mins = o2.mins - o1.mins;
    if(o2.sec<o1.sec){ //borrow from minutes
      o2.sec+=60; --o2.mins;
    }
    diff.sec = o2.sec - o1.sec;
    return diff;
  }
  int compare(Time o1, Time o2){
    int ret=0;
    if((o1.hours>o2.hours)||(o1.mins>o2.mins)||(o1.sec>o2.sec))
      ret=1;
    else if((o1.hours==o2.hours)&&(o1.mins==o2.mins)&&(o1.sec==o2.sec))
      ret=3;
    else
      ret=2;
    return ret;
  }
}

class TimeMain{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Time t1 = new Time();
    Time t2 = new Time();
    Time operation = new Time();
    t1.initialize(t1);
    t1.initialize(t2);
    System.out.print("\n\nTime 1 is "); t1.display(t1);
    System.out.print("\nTime 2 is "); t1.display(t2);
    int k;
    do {
    System.out.print("\n\nCHOOSE: \n 1.ADD \n 2.SUBTRACT \n 3.COMPARE \n:");
    k = in.nextInt();
    switch(k){
      case 1: operation = t1.add(t1,t2);
              System.out.print("\nThe sum = "); t1.display(operation);
              break;
      case 2: operation = t1.subtract(t1,t2);
              System.out.print("\nThe Difference = "); t1.display(operation);
              break;
      case 3: switch(t1.compare(t1, t2)){
                case 1: System.out.print("\nTime 1 is greater."); break;
                case 2: System.out.print("\nTime 2 is greater."); break;
                case 3: System.out.print("\n Time 1 = Time 2."); break;
      } break;
      default: System.out.print("EXIT");
    }
  } while ((k>0)&&(k<4));
  System.out.println();
  }
}
