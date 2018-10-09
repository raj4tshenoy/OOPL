import java.util.*;

class Complex{
  double real, im;
  Scanner in = new Scanner(System.in);
  Complex initialize(Complex obj){
    System.out.print("Enter the real part of the number: ");
    obj.real = in.nextDouble();
    System.out.print("Enter the imaginary part of the number: ");
    obj.im = in.nextDouble();
    return obj;
  }
  void display(Complex obj){
    if(obj.im < 0)
      System.out.print(obj.real+"-i"+(-obj.im));
    else
      System.out.print(obj.real+"+i"+obj.im);
  }
  Complex add(Complex n1, Complex n2){
    Complex sum = new Complex();
    sum.real = n1.real + n2.real;
    sum.im = n1.im + n2.im;
    return sum;
  }
  Complex subtract(Complex n1, Complex n2){
    Complex difference = new Complex();
    difference.real = n2.real - n1.real;
    difference.im = n2.im - n1.im;
    return difference;
  }
}
class ComplexMain{
  public static void main(String[] args) {
    int k;
    Scanner in = new Scanner(System.in);
    Complex num1 = new Complex();
    Complex num2 = new Complex();
    Complex result = new Complex();
    num1.initialize(num1);
    num2.initialize(num2);
    System.out.print("\nComplex number 1 = ");
    num1.display(num1);
    System.out.print("\nComplex number 2 = ");
    num1.display(num2);
    do {
      System.out.print("\n\nCHOOSE: \n 1. ADD \n 2. Subtract \n:");
      k = in.nextInt();
      switch(k){
        case 1: result = num1.add(num1, num2);
                System.out.println("\n\nThe sum is "); num1.display(result); break;
        case 2: result = num1.subtract(num1, num2);
                System.out.println("\n\nThe difference is "); num1.display(result); break;
        default: System.out.println("EXIT");
      }
    } while (k==1||k==2);
  }
}
