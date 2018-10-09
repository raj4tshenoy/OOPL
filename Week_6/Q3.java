import java.util.*;

abstract class Figure{
	abstract double area(int a,int b);	
}

class Rectangle extends Figure{
	double area(int l, int b){
		return (l*b);
	}
}

class Triangle extends Figure{
	double area(int b, int h){
	return (0.5*b*h);
	}
}

class Square extends Figure{
	double area(int a, int b){
	return (a*b);
	}
}

class Q3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Square s = new Square();
		int k;
		do{k=0;
		System.out.print("1.Rectangle 2.Triangle 3.Square :");
		int ch = in.nextInt();
		switch(ch){
			case 1: System.out.print("Enter sides: ");
					int m=in.nextInt();
					int n=in.nextInt();
					System.out.println("Area: "+r.area(m,n)); break;
			case 2: System.out.print("Enter sides: ");
					m=in.nextInt();
					n=in.nextInt();
					System.out.println("Area: "+t.area(m,n)); break;
			case 3: System.out.print("Enter sides: ");
					m=in.nextInt();
					System.out.println("Area: "+s.area(m,m)); break;
		}
		System.out.print("Enter 0 to EXIT. ");
		k = in.nextInt();
		}while(k!=0);		
	}
}
