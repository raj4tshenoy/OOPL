import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Count
{
    static boolean isNumber(String num){
        for(int i=0; i<num.length(); i++){
            char digit = num.charAt(i);
            if(digit <='0' || digit >= '9'){
                return false;
            }
        }
        return true;
    }    
    public static void main(String[] args) 
    {
        BufferedReader reader = null;

        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;

        int numCount = 0;
         
        try
        {
            reader = new BufferedReader(new FileReader("/home/student/some.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                //Updating the lineCount
                 
                lineCount++;
                 
                //Getting number of words in currentLine
                 
                String[] words = currentLine.split(" ");
                 
                //Updating the wordCount
                 
                wordCount = wordCount + words.length;
                 
                //Iterating each word
                 
                for (String word : words)
                {
                    //Updating the charCount
                    if(isNumber(word)){
                        numCount++;
                    }
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
             
            //Printing charCount, wordCount and lineCount
             
            System.out.println("Number Of Chars In A File : "+charCount);
             
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);

            System.out.println("Number Of numbers In A File : "+numCount);

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}