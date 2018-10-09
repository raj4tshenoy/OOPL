import com.course.buildings.*;
import java.util.*;

class Q4{
	//Building h, s;
	public static void main(String[] args){
		House h = new House();
		School s = new School();
	
		h.setsqf(3000);
		h.setstory(2);
		h.setbedr(3);
		h.setbatr(2);
	
		s.setsqf(15000);
		s.setstory(4);
		s.setclsr(10);
		s.setgl("Primary");
	
		System.out.println("\nHOUSE:\nSq. feet = "+h.getsqf()+"\nStory: "+h.getstory()+"\nBedrooms: "+h.getbedr()+"\nBathrooms:"+h.getbatr());
		System.out.println("\nSCHOOL:\nSq. feet = "+s.getsqf()+"\nStory: "+s.getstory()+"\nClassrooms: "+s.getclsr()+"\nGrade level:"+s.getgl());
	}
}