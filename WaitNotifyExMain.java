package threadprog;
class Thread1 extends Thread{
	int total;
	@Override
	public void run() {//overriding
		synchronized(this) {
		for(int i=0;i<=10;i++) {
			total=total+i;
		}
		notify();
	}
}
}
public class WaitNotifyExMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread1 ob=new Thread1();
		ob.start();//child
		System.out.println("after start");
		synchronized(ob) {
			ob.wait();
			
			System.out.println("sum="+ob.total);
		}

	}

}
