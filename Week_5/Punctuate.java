import java.util.*;

class Punctuate{

  static String punc(String num){
    String pnum=""; int i,j;
    for(i = num.length()-1, j=1; i>=0; i--, j++){
      pnum = pnum + num.charAt(i);
      if(j%3==0&&i!=0){
        pnum = pnum + ",";
      }
    }
    num = "";
    for(i=pnum.length()-1; i>=0; i--){
      num = num + pnum.charAt(i);
    }
    return num;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String num, pnum = "";
    System.out.print("Enter number: ");
    num = in.next();
    pnum = punc(num);
    System.out.println("Punctuated string is: "+pnum);
  }
}
