package progarray1;

public class Prog13_01ArrayIniti {

	public static void main(String[] args) {
		//declare and initialize array
		int arr[]= {4,5,7,8,9};//4*5=20 bytes
		System.out.println("first array element" +arr[0]);
		System.out.println("seconnd array element" +arr[1]);
		System.out.println("third array element"+arr[2]);
		System.out.println("fourth array element" +arr[3]);
		System.out.println("fifth array element" +arr[4]);
	
		System.out.println("number of elements in a array "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]=" +arr[i]);
		}

	}

}
