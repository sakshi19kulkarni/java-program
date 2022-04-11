package arrayprog;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicateUserInput {
       public static void main(String[] args) {
	   ArrayList<String>lst;  //declaration
       BufferedReader br;
       String name;
       

      RemoveDuplicateUserInput(){
	  lst = new  ArrayList<>();
	  br = new BufferedReader(new InputStreamReader(System.in));
  } //constr
  
  void addUniqueNames() throws IOException {
	//  System.out.println("Enter numbers of names");
	 // int n=Integer.parseInt(br.readLine());
	  
	  //for(int i=1;i<=n;i++) {
	  
	  while(true) {
	  System.out.println("Enter name");
	  name = br.readLine();
	  if(lst.contains(name)==false) {
		  lst.add(name);
	  }//if
	  else {
		  System.out.println(name+ "already exists");
	  }//else
	  System.out.println("Do you want to continue Y/N");
	  char ch=br.readLine().charAt(0);
	   if(ch=='N') {
		  break;
	   }
	  }
  }//function
      void display() {
	  System.out.println("Names of ArrayList");
	  Iterator it = lst.iterator();
	  while(it.hasNext()) {
		 System.out.println(it.next());
  }//display
 
}//class
 

    public static void main(String[] args) throws IOException {
    RemoveDuplicateUserInput ob = new RemoveDuplicateUserInput();
    ob.addUniqueNames();
    ob.display();
}
}
		
	}
}


*/