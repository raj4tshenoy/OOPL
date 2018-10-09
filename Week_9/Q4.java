import java.util.*; 
import java.util.List;

class Q4{ 
    
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
        Integer i[] = new Integer[5];
        Double j[] = new Double[5];
        System.out.println("Enter 5 integers: ");
        for(int k=0; k<5; k++){
        	i[k] = in.nextInt();
        }
        System.out.println("Enter 5 doubles: ");
        for(int k=0; k<5; k++){
        	j[k] = in.nextDouble();
        }
        List<Integer> list1= Arrays.asList(i); 
        System.out.println("Total sum is:"+sum(list1)); 
  
        List<Double> list2=Arrays.asList(j); 
        System.out.print("Total sum is:"+sum(list2)); 
    } 
  
    private static double sum(List<? extends Number> list)  
    { 
        double sum=0.0; 
        for (Number i: list) 
        { 
            sum+=i.doubleValue(); 
        } 
  
        return sum; 
    } 
} 