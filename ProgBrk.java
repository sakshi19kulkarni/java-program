package prognestedloop;

public class ProgBrk {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==3) {
					break;
				}
				else {
					System.out.println("i=" +i+ "j="+j);
				}
				System.out.println();
			}
		}

	}

}
