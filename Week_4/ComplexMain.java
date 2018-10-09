import java.util.*;

class Complex{
  double real, im;
  Scanner in = new Scanner(System.in);
  Complex(){
    System.out.println("Constructor for object 1.");
    System.out.print("Enter the real part of the number: ");
    real = in.nextDouble();
    System.out.print("Enter the imaginary part of the number: ");
    im = in.nextDouble();
  }
  Complex(double real, double imaginary){
    System.out.println("Constructor for object 2.");
    this.real = real;
    im = imaginary;
  }
  void display(Complex obj){
    System.out.println("The entered complex number is: ");
    if(obj.im < 0)
      System.out.print(obj.real+"-i"+(-obj.im));
    else
      System.out.print(obj.real+"+i"+obj.im);
  }
}
class ComplexMain{
  public static void main(String[] args) {
    Complex a = new Complex();
    Complex b = new Complex(15,-10);
    a.display(a);
    System.out.println();
    a.display(b);
    System.out.println();
  }
}