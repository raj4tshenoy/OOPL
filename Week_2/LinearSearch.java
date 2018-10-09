import java.util.*;

class LinearSearch{

  public static void main(String[] args) {
    System.out.print("Enter number of elements in array: "); //input array
    int n;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    int aray[] = new int[n];
    for(int i=0 ; i<n; i++){
      System.out.print("Enter element "+(i+1)+": ");
      aray[i]=in.nextInt();
    }
    Srch(aray, n);
  }
  public static void Srch(int a[], int n){
    System.out.print("Enter element to find: ");
    Scanner in = new Scanner(System.in);
    int ele = in.nextInt();
    for(int i=0; i<n; i++){
      if(a[i]==ele){
        System.out.println("Element "+ele+" found at position "+ (i+1));
        return;
      }
    }
    System.out.println("Element not found in entered array.");
  }
}
