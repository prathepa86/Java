package javaprograms;


import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Mary";
		String s2="ARMY";
		if(s1.length()==s2.length()) {
			char[] charArray1 = s1.toLowerCase().toCharArray();
			char[] charArray2 = s2.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("The given two strings are anagram");
			}
			else {
				System.out.println("Not an angaram");
			}
			}
		else {
			System.out.println("It is not an anagram");
		}
		}

}
