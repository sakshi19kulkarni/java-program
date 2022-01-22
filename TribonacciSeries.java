package conditional;

public class TribonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0;
     int b=1;
     int c=2; 
     int d;
	System.out.print(a+ " "+b+ " "+c+ " ");
	for(int i=3;i<10;i++) {
		d=a+b+c;
		System.out.print(d+ " ");
		a=b;
		b=c;
		c=d;
		
	}


}
}
