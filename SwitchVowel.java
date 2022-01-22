package sakshidemo1;

import java.util.Scanner;

public class SwitchVowel {
	public static void main(String args[]) {
		
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char to check vowel or not");
		ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(ch+" is an Vowel");
			break;
		default:
			System.out.println("not an Vowel");
		}
		
			
	}

}
