package threadprog;

class MyClassTh extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			System.out.println("eating pizza 1");
			
		for(int i=1;i<=50;i++) {
			
			total+=i;
			System.out.println("eating pizza 2");
			
		}
		notify();
		
	}
}
}

public class ThreadCommunicationMain {

	public static void main(String[] args) throws InterruptedException {
		MyClassTh t=new MyClassTh();  //Thread-0 , main
		t.start();
		synchronized (t) {
			
			 System.out.println("Waiting for pizza");
		          t.wait();//
		          System.out.println("you had pizza");
		     }
    }
}



