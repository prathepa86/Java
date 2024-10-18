package javaprograms;

public class CountCharacterOccurenceInAGivenString {

	public static void main(String[] args) {
		String s1="hello apple";
		int initial=s1.length();
		s1=s1.replace("p","");
		int finallen=s1.length();
		System.out.println(initial-finallen);
		
	}

}
 