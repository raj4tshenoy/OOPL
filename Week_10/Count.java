import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Count
{
/************************************************************
isNumber function - returns true if given string is a number
************************************************************/
    static boolean isNumber(String num){
        for(int i=0; i<num.length(); i++){
            char digit = num.charAt(i);
            if(digit <'0' || digit > '9'){
                return false;
            }
        }
        return true;
    }    

//////////////////MAIN FUNCTION////////////////////////////

    public static void main(String[] args) 
    {
        BufferedReader reader = null; //To read each individual line.

        //Counters
        int charCount = 0; 
        int wordCount = 0;
        int lineCount = 0;
        int numCount = 0;
         
        try
        {
            reader = new BufferedReader(new FileReader("/home/student/some.txt")); // !Might return IOException
             
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
                    //Updating the numCount
                    if(isNumber(word)){
                        numCount++;
                    }
                    //Updating the charCount
                    charCount = charCount + word.length();
                }

                //Reading next line
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
                reader.close(); //closing file from memory. !Might return IOException
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}

/*****************************************************

Script Created on: 18-10-21 21:00 - Verified Working
Script Written by: RAJAT SHENOY
Github: https://www.github.com/raj4tshenoy/OOPL.git

*****************************************************/