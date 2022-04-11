package arrayprog;

import java.util.ArrayList;
import java.util.Iterator;

class Students{
	int roll_no;
	String strname;
	float fees;
	
	public Students(int i,String string,int j) {
		roll_no =i;
		strname=string;
		fees=j;
	}
}

public class CustomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students ob1 = new Students(1,"sakshi",22000);
		Students ob2=new Students(2,"shraddha",21000);
		
		ArrayList<Students> a1=new ArrayList<>();
		a1.add(ob1);
		a1.add(ob2);
		System.out.println(a1);
		
		Iterator it=a1.iterator();
		while(it.hasNext()) {
			Students ob=(Students)it.next();
			System.out.println("roll num:" +ob.roll_no);
			System.out.println("name:" +ob.strname);
			System.out.println("fees:" +ob.fees);
			
		}
	}

}
