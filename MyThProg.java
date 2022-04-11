package threadprog;

class MyThre extends Thread{
   public void run() {
	   System.out.println("child thread"+Thread.currentThread());
   }


void dispay() {
	System.out.println("Display"+Thread.currentThread());
}
}

public class MyThProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM Thread"+Thread.currentThread());
		MyThre ob=new MyThre();
		ob.dispay();
		ob.start();
		
		

	}
}


