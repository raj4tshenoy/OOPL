class Sorting {

    public static <T> void swap(T[] arr, T x, T y){
         int x1=0,y1=0;        
	 for (int i=0;i< arr.length;i++)
          if(arr[i].equals(x)){ x1=i; break;}
         for (int i=0;i< arr.length;i++)
          if(arr[i].equals(y)){ y1=i; break;}
         T temp = arr[x1];
         arr[x1] = arr[y1];
         arr[y1] = temp;
    }
}
public class SortTest2 {

    public static void main(String[] args){

        Integer[] nums = {5, 12, 3, 7, 2};
        Sorting.swap(nums, 12, 2);
        for (int i=0;i< nums.length;i++)
          System.out.print(nums[i]+" , "); 
    }
}
