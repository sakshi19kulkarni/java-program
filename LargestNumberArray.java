package progarray1;

public class LargestNumberArray {

	public static void main(String[] args) {
		int arr[]= {4,5,7,8,9};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest of all array elements=" +max);

	}

}
