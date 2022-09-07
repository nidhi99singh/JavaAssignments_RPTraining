package Strings;

import java.util.Arrays;

public class CountWords {

public static void main(String [] args) {
	
	String str="NidhiSinghPanwarNidhi";
	String [] split= str.split("(?=[A-Z])");
	System.out.println("No of words: "+ split.length);
	for(int i=0;i<split.length;i++) {
		System.out.println(split[i]);	
	}
	
}
	
}
