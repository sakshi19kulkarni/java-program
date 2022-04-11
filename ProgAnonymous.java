package threadprog;

class Demo{
	synchronized void print(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println("n x"+i+"="+n*i);
		}
	}
}

public class ProgAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo tb=new Demo();
		
		Thread t=new Thread() {//anonymous class
			public void run() {
				System.out.println("Inside run");
				tb.print(7);;
			}
		};
		t.start();
		
	      Thread t1=new Thread() {//anonymous class
			public void run() {
				System.out.println("Inside run");
				tb.print(4);;
			}
		};
		t1.start();
		
		new Thread() {//anonymous class anonymous object
			public void run() {
				System.out.println("Inside");
				tb.print(9);
			}
		}.start();
		
		Runnable r1=new Runnable() {//using runnable interface

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable with Anonymous Class");
				
			}

	};
	new Thread(r1).start();

}
}