import java.util.*;
import java.io.*;

class SeatsFilledException extends Exception{

	SeatsFilledException(){
		System.err.println("Seats Full");
	}

}

class Student throws SeatsFilledException{
	String regno;
	void input(){
		int year, seat;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: ");
		int y = in.nextInt();
		System.out.print("Enter seat: ");
		int s = in.nextInt();
		int rno = y*100+s;
		regno = rno.toString();
	} 	
}

class Q3{
	public static void main(String[] args) {
		Student s = new Student();
		try{
			s.input();
		}
		catch(SeatsFilledException er){
			er.printStackTrace();
		}
	}
}