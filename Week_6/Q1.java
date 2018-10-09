import java.util.*;

class Person{
	private String name;
	private int bday;
	
	Person(){
		name = "";
		bday = 0;
	}
	
	void setname(String name){
		this.name = name;
	}
	
	void setbday(int dob){
		bday = dob;
	}
	
	String getname(){
		return name;
	}
	int getbday(){
		return bday;
	
	}
}

class CollegeGraduate extends Person{
	private float gpa;
	private int yograd;
	
	CollegeGraduate(String name, int bday, float gpa, int yograd){
	setname(name);
	setbday(bday);
	this.gpa = gpa;
	this.yograd = yograd;
	}
	
	float getgpa(){
		return gpa;
	}
	int getyog(){
		return yograd;
	}
	void display(){
		System.out.println("\nDISPLAY:\n");
		System.out.println("Name: "+getname()+" \nDOB: "+getbday()+" \nGPA: "+ gpa +"\nYear of Graduation: "+yograd);
		System.out.println("-----------------------------------------------------------\n\n");
	}
}

class Q1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("No. of Entries: ");
		int n = in.nextInt();
		CollegeGraduate l[] = new CollegeGraduate[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter name, date of birth, gpa & year of graduation: ");
			String name = in.next();
			int dob = in.nextInt();
			float gpa = in.nextFloat();
			int yog = in.nextInt();
			l[i] = new CollegeGraduate(name, dob, gpa, yog);
		}
		System.out.println("Data Saved.");
		int k;
	 	do{ k=0; int ind;
	 	System.out.print("Enter index of person. ");
	 	ind = in.nextInt();
	 	l[ind-1].display();
	 	System.out.println("Enter 1 to exit.");
		}while(k!=1);
	}
}
