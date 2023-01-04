package Practice;

import java.util.Scanner;

public class IsVowelUsingMethod {
  /*
   * Write a value-returning method, isVowel that returns the value true if a given character is a vowel, 
   * and otherwise returns false. In main() method accept a string from user and count number of vowels in that string.
   */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String");
		String str;
	    str =sc.nextLine();
		int count =0;
		
		for(int i=0;i< str.length(); i++) {
			
			if (isVowel(str.charAt(i))) {
				count= count +1;
			}
			
		} 
		
		System.out.println(" The vowels are "+ count);
		
	}
	
	static boolean isVowel(char letter) {
		
		switch(letter) {
		
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
			return true;
		default:
			return false;
		}
	}
	
}
