import java.util.*;
import java.io.*;
import java.lang.*;
class Employee{
	String name = new String("");
	Integer age = new Integer(0);
	Double gsalary = new Double(0.0d);
	Float thsalary = new Float(0.0f);
	char grade;
	void input(){
		Scanner in = new Scanner(System.in);
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		try{
		System.out.print("Enter name, age, gross salary, take home salary, grade: ");
		name = br.readLine();
		age = Integer.parseInt(br.readLine());
		gsalary = Double.parseDouble(br.readLine());
		thsalary = Float.parseFloat(br.readLine());
		grade = in.next().charAt(0);}
		catch(IOException er){
			er.printStackTrace();
		}
	}
	void display(){
		System.out.println("DISPLAY: ");
		System.out.println("Name: "+name+"\nAge: "+age+"\nGross salary: "+gsalary+"Take home salary: "+thsalary+"Grade: "+grade);
	}
}

class Q2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of entries: ");
		int n;
		n=in.nextInt();
		Employee e[] = new Employee[n];
		for(int i=0; i<n; i++){
				e[i].input();
		}
		System.out.println("Data stored.");
		int k; k = in.nextInt();
		do{ k=1;
			System.out.print("Enter index: ");
			int ind;
			ind = in.nextInt();
			e[ind].display();
			System.out.print("IO Exception.");
			System.out.print("Enter 0 to exit.");
			k = in.nextInt();
		}while(k!=0);
	}
}