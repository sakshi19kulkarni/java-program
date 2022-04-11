package threadprog;

class ChildThread extends Thread{
	public void run() {
		System.out.println("Run method" +Thread.currentThread());
	}
}

public class MainPriority {

	public static void main(String[] args) {
		System.out.println("Main method"+Thread.currentThread());
		
		ChildThread ob=new ChildThread();
		ChildThread ob1=new ChildThread();
		
		ob.setName("first");
		ob1.setName("second");
		
		ob.setPriority(3);
		ob.setPriority(10);
		
		ob.start();
		ob1.start();
		
		//System.out.println(Thread.NORM_PRIORITY);
		//System.out.println(Thread.MIN_PRIORITY);
		//System.out.println(Thread.MAX_PRIORITY);

	}

}
