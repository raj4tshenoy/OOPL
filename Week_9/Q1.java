import java.util.*;

class Gen{
	public static <T> void swap(T list[], T x, T y){
		int a=0, b=0; boolean flag1=false, flag2=false;
		for(int i=0; i<list.length; i++){ //finds position of the required elements.
			if(flag1&&flag2){
				break;
			}
			if(x.equals(list[i])){a=i; flag1=true;}
			if(y.equals(list[i])){b=i; flag2=true;}
		}
		T temp = list[a];
		list[a] = list[b];
		list[b] = temp;
}
}

class Q1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer l1[] = new Integer[5];
		String l2[] = new String[5];
		System.out.println("Enter 5 integers: ");
		for(int i=0; i<5; i++){
			l1[i] = in.nextInt();
		}
		System.out.println("Enter 5 Strings: ");
		for(int i=0; i<5; i++){
			l2[i] = in.next();
		}
		System.out.println("Enter ints to swap: ");
		Gen.swap(l1,in.nextInt(), in.nextInt());
		System.out.println("Enter Strings to swap: ");
		Gen.swap(l2, in.next(), in.next());
		System.out.println("Display Int list: ");
		for(int i=0; i<5; i++){
			System.out.print(l1[i]+" ");
		}
		System.out.println();
		System.out.println("Display String list: ");
		for(int i=0; i<5; i++){
			System.out.print(l2[i]+" ");
		}
	}
}