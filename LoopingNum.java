package sakshidemo1;

public class LoopingNum {
	public static void main(String args[]) {
		int i;
		i=1;
		
		while(i<=100) {
			System.out.println(i);
			++i;
		}
		System.out.println("outside loop" +i);
	}

}
