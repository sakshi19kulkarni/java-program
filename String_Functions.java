package my18program;

public class String_Functions {

	public static void main(String[] args) {
		// find the length of the string
		//string.length();
		String s="Hello how are you";
		System.out.println("Number of characters="+s.length());
		System.out.println("character at 2nd position "+s.charAt(1));
		System.out.println("last character "+s.charAt(s.length()-1));
		
		//program to find number of vowels a,e,o,i,u
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'|| ch=='A'|| ch=='E' || ch=='I'||ch=='O'||ch=='U');
			c++;
		}
	
	System.out.println("number of vowels=" +c);

}
}
