import java.util.*;
import java.io.*;

class CopyFile{
	public static void main(String[] args) {
	try{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter path of file to read: ");
		String readpath = in.next();
		System.out.println("Enter path of file to write: ");
		String writepath = in.write();

		//writer and reader objects created for respective files. !Might return IOException
		FileWriter fw = new FileWriter(writepath);
		FileReader fr = new FileReader(readpath);
		
			int copy;
			while((copy=fr.read()) != -1){ //copying each word in file to other file.
				fw.write(copy);
			}
			System.out.println("Copied File!"); //Finish Notification
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

/*****************************************************

Script Created on: 18-10-21 21:00 - Verified Working
Script Written by: RAJAT SHENOY
Github: https://www.github.com/raj4tshenoy/OOPL.git

*****************************************************/