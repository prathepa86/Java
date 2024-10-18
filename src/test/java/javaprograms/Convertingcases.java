package javaprograms;

public class Convertingcases {

	public static void main(String[] args) {
		String s1="HelLO";
		int upperCase=0;
		int lowerCase=0;
		for(int i=0;i<s1.length();i++) {
			if (Character.isUpperCase(s1.charAt(i))) 
			{
				upperCase++;
			}
					
			else if(Character.isLowerCase(s1.charAt(i))) {
				lowerCase++;
			}
			else {
				System.out.println("Special characters"+s1.charAt(i));
			}
				
			}
		if(upperCase>lowerCase) {
			System.out.println("The number of lower case is:"+upperCase+", Converting into uppercase letters:"+s1.toUpperCase());
		}
		else {
			System.out.println("The number of lower case is:"+lowerCase+", Converting lower case letters :"+s1.toLowerCase());
		}
		
		}
	}


