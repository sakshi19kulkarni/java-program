package my18program;

public class TotalNumOfWords {

	public static void main(String[] args) {
		String s="hello how are you";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== ' ') 
		     c++;
		}
		System.out.println("total number of words= "+(c+1));

	}
	}


