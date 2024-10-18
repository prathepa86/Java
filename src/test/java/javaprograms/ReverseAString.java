package javaprograms;

public class ReverseAString {

	public static void main(String[] args) {
		String s1="Hello world";
		String revString="";
		String revWord="";
		
		
	     String[] split = s1.split(" ");
		  for(int i=split.length-1;i>=0;i--) { 
			  revWord=revWord+split[i];
		  
		  } revString=revString+revWord;
		  System.out.println("The reversed string are"+revString);
		  
		  
			
			/*
			 * for(int i=s1.length()-1;i>=0;i--) { revString=revString+s1.charAt(i); }
			 * System.out.println(revString);
			 * 
			 * 
			 * char[] charArray = s1.toCharArray(); for(int i=charArray.length-1;i>=0;i--) {
			 * revString=revString+charArray[i]; } System.out.println(revString);
			 * 
			 * //using String buffer class
			 * 
			 * StringBuffer str=new StringBuffer(); str.append(s1); str.reverse();
			 * System.out.println(str);
			 * 
			 * 
			 */
		
		
		

	}

}
