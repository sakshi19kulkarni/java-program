package stackprog;

import java.util.Stack;

public class StackDemoPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<String> st=new Stack<>();
			st.push("one");
			st.push("two");
			st.push("three");
			st.push("four");
			
			System.out.println(st);
			System.out.println(st.pop());
			System.out.println(st);
			//System.out.println(st.peek());//three
			//System.out.println(st);
			
			/*int i=st.search("one");
			System.out.println(st.get(2));
			System.out.println(st.get(0));
			st.clear();
			System.out.println(st.empty());
			System.out.println(st.pop());
			System.out.println(st.peek());
			*/

	}

}
