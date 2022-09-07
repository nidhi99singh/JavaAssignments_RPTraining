package javapackage;

public class AnimalsCount {
	public static int count(int heads,int legs) {
		int rabbitCount=0;
		rabbitCount=(legs-(2*heads))/2;
		return rabbitCount;
	}
	
	public static void main(String [] args) {
		int heads=150,legs=500;	
	int rabbits=count(heads,legs);
	System.out.println("total Rabbits :" + rabbits);
	int chickens=heads-rabbits;
	System.out.println("total chickens :" + chickens);
	}

}
