package stackprog;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<String> obq=new PriorityQueue();
		//obq.add("Rutu");
		//obq.add("Kirti");
		//obq.add("Praju");
		
		Queue<Integer>obq=new PriorityQueue();
		obq.add(1);
		obq.add(8);
		obq.add(9);
		obq.add(6);
		obq.add(10);
		
		System.out.println("Queue "+obq);
		System.out.println(obq.poll());
		//System.out.println(obq.remove());
		System.out.println("Queue "+obq);
		
		//System.out.println(obq.remove());

	}

}

