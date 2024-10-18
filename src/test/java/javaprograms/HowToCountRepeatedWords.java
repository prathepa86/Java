package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class HowToCountRepeatedWords {
//How to count repeated words in a given string
	public static void main(String[] args) {
		String s1="java is a programming lanaguage java";
		int count=1;
		String[] split = s1.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<split.length;i++) {
			if(!map.containsKey(split[i])) {
				map.put(split[i],count);
			}else
			{
				map.put(split[i], map.get(split[i])+1);
			}
		}
		
		for(String key:map.keySet()) {
			System.out.println(key+"-"+map.get(key));
		}
		
		
	}

}
