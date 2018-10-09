package files;

import java.io.*; 
class FileReaderWriter 
{ 
      public static void main(String[] args) 
     { 
         int ch; 
         String str="Welcome Java World"; 
         try 
         { 
           FileWriter fileWrite = new FileWriter("java.txt");   
           fileWrite.write(str); 
           fileWrite.close(); 
         } 
         catch(IOException e)  { 
        	 e.printStackTrace();
        	 } 
         try 
         { 
              FileReader fileRead=new FileReader("java.txt"); 
              while((ch=fileRead.read())!=-1) 
              System.out.print((char)ch); 
              fileRead.close(); 
          } 
              catch(IOException e)  {
            	  e.printStackTrace();
            	  } 
      } 
} 

