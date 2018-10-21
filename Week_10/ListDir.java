import java.util.*;
import java.io.*;
import java.io.File;

class ListDir{
	static void LsPrint(File[] arr,int index,int level){
		if(index == arr.length) 
             return;
           
         // for files 
         if(arr[index].isFile()) 
             System.out.println(arr[index].getName()); 
           
         // for sub-directories 
         else if(arr[index].isDirectory()) 
         { 
             System.out.println("[" + arr[index].getName() + "]"); 
               
             // recursion for sub-directories 
             LsPrint(arr[index].listFiles(), 0, level + 1); 
         } 
            
         // recursion for main directory 
         LsPrint(arr,++index, level);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter directory: ");
		String dirpath = in.next();
		File dir = new File(dirpath);
		if(dir.exists() && dir.isDirectory()){
			File list[] = dir.listFiles();
			System.out.println("*******************************************");
			System.out.println("Files from Directory: "+dir);
			System.out.println("*******************************************");

			LsPrint(list,0,0);
		}
		else
			{System.out.println("Directory not found.");}
	}
	
}