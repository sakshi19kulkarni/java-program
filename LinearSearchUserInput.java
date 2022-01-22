package progarray1;

import java.util.Scanner;

public class LinearSearchUserInput {

	public static void main(String[] args) {
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter search element");
		int key=sc.nextInt();
		//linear search
		
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				pos=i+1;
				break;
			}		
			}
		System.out.println("Array elements are ");
		/* for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
	
		//enhanced for loop
		/*for(data_type variable name:array_name){
		 * System.out.println(i)
		 * }
		 */
		
		for(int i:a) {
			System.out.println(i);
		}
		if(pos>0) {
			System.out.println("sucessful search:");
			System.out.println(key +"found at position "+pos);
		}
		else {
			System.out.println("unsuccessful search");
		}
		
		
		
	}
	}


