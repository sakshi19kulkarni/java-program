package sakshidemo1;

public class LoopingSum {
	public static void main(String args[]) {
		int num=50,i,sum=0;
		i=1;
		
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("result is :" +sum);
	}
		
	}


