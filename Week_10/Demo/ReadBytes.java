package files;
import java.io.*;

class ReadBytes {
  public static void main(String[] args)
    throws IOException {
      byte[] data = new byte[10];
      byte[] data2 = new byte[10];
      System.out.println("Enter some characters.");
      int numRead = System.in.read(data);
      int numRead2=System.in.read(data2);
      System.out.print("You entered: ");
      for(int i=0; i < numRead; i++)
        System.out.print((char) data[i]);
      for(int i=0; i < numRead2; i++)
          System.out.print((char) data2[i]);
      
      
      
  }
}
