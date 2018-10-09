import java.util.*;


class MultTable extends Thread{
	int a;
	MultTable(int a){
		this.a = a;
	}
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
}

class Tables{
	public static void main(String[] args) {
		System.out.print("Enter 2 numbers: ");
		Scanner in = new Scanner(System.in);
		MultTable p1 = new MultTable(in.nextInt());
		MultTable p2 = new MultTable(in.nextInt());
		p1.start();
		try{
			p2.sleep(200);
		}
		catch(InterruptedException e){}
		p2.start();
	}
}