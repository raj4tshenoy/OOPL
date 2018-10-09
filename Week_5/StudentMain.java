import java.util.*;

class Student{
	int regno;
	String name;
	GregorianCalendar date;
	short sem;
	float gpa, cgpa;
	static int count = 1;	
	Student(){
		regno = 0;
		name = "";	
		date = new GregorianCalendar(0,0,0);
		sem=0;
		gpa=0; 
		cgpa=0;
		count++;;
	}
	Student(String name, GregorianCalendar date, short sem, float gpa, float cgpa){
	regno = 0;
	int year = date.get(Calendar.YEAR);
	if(year>2000){	
		regno = regno + (year - 2000)*100 + count;
	}
	else{
		regno = regno + (year - 1000)*100 + count;
	}
	this.name = name;
	this.date = date;
	this.sem = sem;
	this.gpa = gpa;
	this.cgpa = cgpa;
	count++;	
	}
	void display(Student s){
		System.out.println("Registration number: "+s.regno);
		System.out.println("Name: "+s.name);
		System.out.println("Date of joining: "+s.date.get(Calendar.YEAR)+"/"+s.date.get(Calendar.MONTH)+"/"+s.date.get(Calendar.DAY_OF_MONTH));
		System.out.println("Semester: "+s.sem);
		System.out.println("GPA: "+s.gpa);
		System.out.println("CGPA: "+s.cgpa);
	}
}

class StudentMain{
	
	static void display(Student s[]){
		Scanner in = new Scanner(System.in);
		int k, i=0;
		System.out.println("DISPLAY RECORDS: ");
		do{k=0;
		System.out.print("Enter record number to display: ");
		i = in.nextInt();
		if(i<=10&&i>=1){
			s[0].display(s[i-1]);
		}
		System.out.print("Enter 1 to continue.\n\n");
		k = in.nextInt();
		}while(k==1);
	}

	static void sortsem(Student s[], int n){
		System.out.println("\nSorting by semester...");
		Student temp = new Student();
		for(int i=0; i<n; i++){
			for(int j=0; j<n-1-i; j++){
				if(s[j].sem>s[j+1].sem){
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.println("\n\nSORTED ACCORDING TO SEMESTER. \n\n");
		display(s);
	}
	
	static void sortname(Student s[], int n){
	System.out.println("\nSorting by name...");
		Student temp = new Student();
		for(int i=0; i<n; i++){
			for(int j=1; j<n-i-1; j++){
				if(s[j].name.compareTo(s[j+1].name)>0){
					temp = s[j+1];
					s[j+1] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("\n\nSORTED ACCORDING TO NAME.\n\n");
		display(s);
	}
	
	static void startchar(Student s[], int n){
		String ch;
		Scanner in = new Scanner(System.in);
		System.out.println("\n\nNAME WITH PARTICULAR CHARACTER:\n\n ");
		System.out.println("Enter Character: ");
		ch = in.next();
		for(int i=0; i<n-1; i++){
			if(s[i].name.charAt(0)==ch.charAt(0)){
				System.out.println("Registration number: "+s[i].regno+"\nName: "+s[i].name);
			}
		}
	}
	
	public static void main(String[] args){
		int y,m,d;
		GregorianCalendar date;
		Scanner in = new Scanner(System.in);
		Student s[] = new Student[10];
		int k=0; int i=0;
		do{k=0;
			System.out.print("Enter Student name: ");
			String name = in.next();
			System.out.print("Enter Year of joining: ");
			y = in.nextInt();
			System.out.print("Enter Month of joining: ");
			m = in.nextInt();
			System.out.print("Enter Date of joining: ");
			d = in.nextInt();
			date = new GregorianCalendar(y,m,d);
			System.out.print("Enter semester, gpa and cgpa: ");
			double sem = in.nextDouble();
			float gpa = in.nextFloat();
			float cgpa = in.nextFloat();
			s[i++] = new Student(name, date, (short)sem, gpa, cgpa); 
			System.out.print("Enter 1 to create another record: \n\n");
			k = in.nextInt();
		}while(k==1&&i<10);	
		
		display(s);	
		sortsem(s, Student.count-1);
		sortname(s, Student.count);
		startchar(s, Student.count);
	}
}


