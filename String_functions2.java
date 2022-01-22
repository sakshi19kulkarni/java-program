package my18program;

public class String_functions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="hello friends";
       //substring
       String s1=s.substring(3,8);
       System.out.println(s1);//include starting exclude the ending 
                              //index
	   System.out.println(s.substring(6));
	   
	   System.out.println(s.substring(s.length()-1));
	   System.out.println(s.charAt(s.length()-1));
	   
	   System.out.println(s.indexOf(s.charAt(6)));
	   System.out.println(s.indexOf('r'));
	   
	   System.out.println(s.lastIndexOf('l'));
	   System.out.println("hello");
	   System.out.println(s.contains("hellofghf"));
	   
	}

}
