package files;


import java.io.*;
public class FRFWFileCopy
{
  public static void main(String args[])
  {
    try
    {  
      FileReader fr = new FileReader("E://A1.txt");
      FileWriter fw = new FileWriter("E://A2.txt");
     
      int k;
      while( ( k = fr.read() ) != -1 )
      {
        fw.write(k);   		
        System.out.print((char) k);  
      }
      fw.close();
      fr.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File does not exist. " + e);
    }
    catch(IOException e)
    {
      System.out.println("Some I/O problem. " + e);
    }
  }
}
