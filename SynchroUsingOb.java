package threadprog;

class Data{
	void print(int n) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println("n x"+i+"="+n*i);
			}
		}
		
	}

}
class FirstThread1 extends Thread{
	Data t;
	public FirstThread1(Data te) {
		this.t=te;
	}public void run() {
		t.print(5);
	}
}
class SecondThread2 extends Thread{
	Data t;
	public SecondThread2(Data te) {
		this.t=te;
	}public void run() {
		t.print(10);
	}
}


public class SynchroUsingOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data te=new Data();
		FirstThread1 t1=new FirstThread1(te);
		SecondThread2 t2=new SecondThread2(te);
		t1.start();
		t2.start();

	}

}
