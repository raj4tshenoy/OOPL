import java.util.*;
import java.io.*;

class WordSearch{
	//////////////MAIN FUNCTION////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String fpath = in.next();
		BufferedReader fr = null;
		try
		{	try
			{fr = new BufferedReader(new FileReader(fpath));} // !might throw IOException
			catch(FileNotFoundException f){
				System.out.println("File Not Found.");
				System.exit(0);
			}
			System.out.print("Enter Word: ");
			String target = in.next();
			int lineCount = 0;
			String currentLine;
			for(currentLine = fr.readLine();currentLine!=null;currentLine = fr.readLine()){ //for each line in the file
				String words[] = currentLine.split(" ");
				lineCount++;
				for(String word : words){
					if(word.equals(target)){
						System.out.println(lineCount+". "+currentLine); //printing occurence
					}
				}
			}
		}	
		catch(IOException e){
			System.out.println(e);	
		}
		finally{
			try{
				fr.close(); //closing file in memory
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
	}
}

/*****************************************************

Script Created on: 18-10-21 21:00 - Verified Working
Script Written by: RAJAT SHENOY
Github: https://www.github.com/raj4tshenoy/OOPL.git

*****************************************************/