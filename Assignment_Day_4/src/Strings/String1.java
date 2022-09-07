package Strings;

public class String1 {

	public static void main(String [] args) {
		String str="deepesh";
		String result="";
		for(int i=0;i<str.length();i++) {
			if(i==str.length()-1) {
				continue;
			}
			char c=str.charAt(i);
			if(c!=str.charAt(i+1)) {
//				str=str.substring(0,i)+str.substring(i+2);
				result+=c;
			}else {
				i++;
			}	
		}
		System.out.println("output: "+result);
	}
}
