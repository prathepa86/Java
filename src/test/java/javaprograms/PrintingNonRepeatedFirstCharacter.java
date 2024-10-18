package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class PrintingNonRepeatedFirstCharacter {

	public static void main(String[] args) {
		String s1="HelloWorld";
		int count=1;
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s1.length();i++) {
			if(!map.containsKey(s1.charAt(i)))
					{
				map.put(s1.charAt(i),count);
			}else {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+"-"+entry.getValue());
				break;
			}
			
		}
		

	}

}
