package Strings;

public class String2 {

	    public static void main(String [] args) {

	        String str="aabccde";

	        String result="";

	        for(int i=0;i<str.length();i++) {
	            char c=str.charAt(i);
	            if(i==str.length()-1) {
	                result+=c;
	                continue;
	            }
	            char d = str.charAt(i+1);
	             if(c!=d) {

	                result+=c;
	            }else {

	                i++;
	            }  
	        }
	        if (result.equals(""))
	        System.out.println("output: "+"Empty String");
	        else
	        System.out.println("output: "+result);
	    }
	}
