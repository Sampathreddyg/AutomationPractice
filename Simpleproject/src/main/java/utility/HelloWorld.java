package utility;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HelloWorld {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	   public void data(String data, int i) {}
	    
	    public HashMap<Character, Integer> test(String str){
	        char[] ch=str.toCharArray();
	        HashMap<Character, Integer>map= new HashMap<Character, Integer>();
	        for(char c:ch){
	            if(map.containsKey(c)){//t
	                map.put(c, map.get(c)+1);
	            }
	            else{
	                map.put(c,1);
	            }
	        }
	        
	        //for(Map.Entry<Character, Integer> data:map.entrySet()){
	          //  if(data.getValue()>1){
	    //System.out.println(data.getKey()+" "+data.getValue());            
	            
	        
			return map;
	    }
	    public static void main(String[] args) {
	        HelloWorld hello= new HelloWorld();
	       HashMap<Character, Integer> data= hello.test("sampathreddyguttireddy");
	       
	       for(Entry<Character, Integer> duplicate:data.entrySet()) {
	    	   if(duplicate.getValue()>1) {//t
	    		   System.out.println(duplicate.getKey()+" "+duplicate.getValue());
	    	   }
	       }
	    }
	}

