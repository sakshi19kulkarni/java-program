package threadprog;

class Table{
	synchronized void print(int n,String s) {
		for(int i=1;i<=10;i++) {
			System.out.println("n x"+i+"="+n*i);
		}
	}
}
class FirstThread extends Thread{
	Table t;
	public FirstThread(Table te) {
		this.t=te;
	}
	public void run() {
		t.print(5,"hello");
	}
}
class SecondThread extends Thread{
	Table t;
	public SecondThread(Table te) {
		this.t=te;
	}
	public void run() {
		t.print(10,"hi");
	}
}

public class MethodSynchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table te=new Table();
		FirstThread t1=new FirstThread(te);
		SecondThread t2=new SecondThread(te);
		t1.start();
		t2.start();

	}

}
