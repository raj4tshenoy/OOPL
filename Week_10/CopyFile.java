import java.util.*;
import java.io.*;

class CopyFile{
	public static void main(String[] args) {
	try{
		FileWriter fw = new FileWriter("/home/student/some2.txt");
		FileReader fr = new FileReader("/home/student/some3.txt");
		
			int copy;
			while((copy=fr.read()) != -1){
				fw.write(copy);
			}
			System.out.println("Copied File!");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}