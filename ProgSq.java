package prognestedloop;

public class ProgSq {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {
			for(i=1;i<=3;i++) {
				for(j=1;j<=4;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	}

}
