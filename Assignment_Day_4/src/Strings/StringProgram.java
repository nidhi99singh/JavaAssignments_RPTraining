package Strings;

public class StringProgram {

	public static void main(String [] args) {
		
		StringBuilder string=new StringBuilder();
		string.append("aabbbccdd");
		
		for(int i=0;i<string.length()-1;i++) {
			char c=string.charAt(i);
			if(c==string.charAt(i+1)) {
				string.delete(i, i+2);
				i=0;
			}
	
		}
		System.out.println(string);
	}
	
}
