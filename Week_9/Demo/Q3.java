import java.util.Scanner;

class genStack<T>
{
T arr[];
int top;
genStack(T a[])
{
	this.arr=a;
	top=-1;
}
	

public void push(T ele)
{
	if(top==arr.length-1)
	{
		System.out.println("Error:Stack full");
		
	}
	else
	{
		arr[++top]=ele;
	}
}

public String pop()
{
 if(top==-1)
 {
	 System.out.println("empty");
	 return null;
 }
 
 else
 {
	 return arr[--top].toString();
 }

}

void display()
{
	int temp=top;
	while(top!=-1)
	{
		System.out.println(this.pop());
		top=temp;
	}
}
}

class Employees
{
	
	String name;
	int id;
	Employees(String n, int i)
	{
		
		name=n;
		id=i;
		
	}
	public String toString()
	{
		return("Name:"+name+"Id:"+id);
		
	}
}
class Students
{
	String name;
	int regno;
	Students(String n, int r)
	{
		name=n;
		regno=r;
	}
	
	public String toString()
	{
		return("Name :"+name+"regno:"+regno);
	}

}

public class Q3
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		Employees E[]=new Employees[2];
		Students s[]=new Students[3];
		Employees e;
		Students s1;
		genStack<Employees> emp=new genStack<Employees>(E);
		genStack<Students> stud=new genStack<Students>(s);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter name and id");
			String name=sc.next();
			int id=sc.nextInt();
			Employees ref1=new Employees(name,id);
			emp.push(ref1);
		}
		for(int u=0;u<3;u++)
		{
			String name=sc.next();
			int id=sc.nextInt();
			Students ref2=new Students(name,id);
			stud.push(ref2);
		}
		emp.display();
		stud.display();
			
		
		
	}
		
	}
	
