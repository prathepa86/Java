package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String s1="holidayy";
		int count=1;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
	     char[] charArray = s1.toCharArray();
	     for(int i=0;i<charArray.length;i++) {
	    	 if(!map.containsKey(charArray[i])) {
	    		 map.put(charArray[i],count);
	    	 }else {
	    		 map.put(charArray[i],map.get(charArray[i])+1);
	    	 }
	     }
	     
	     for(Character key:map.keySet()) {
	    	 if(map.get(key)>1)
	    	 {
	    		 System.out.println("Duplicate characters are:"+key+"-"+map.get(key));
	    	 }
	     }
	     

	}

}
