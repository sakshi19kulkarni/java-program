package progarray1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,2,5,6,3};
       
       
        outer:
        for(int i=0;i<a.length;i++) {
        	inner:
        		for(int j=0;j<i;j++) {
        			if(a[i]==a[j]) {
        				continue outer;
        			}
        		}
        		System.out.println(a[i]);
      
	}
        
       /* System.out.println("Non duplicate values:");
        for(int i=0;i<b.length;i++) {
        	System.out.println(b[i]+" ");
        */
        
        	
        }
        
	
}
