package overloading_assignment;

public class BillMain {

	public static void main(String [] args) {
			
			Bill bill1=new Bill();
			int price1=bill1.findPrice(1004);
			System.out.println("Item price is "+price1);
			
			Bill bill2=new Bill();
			int price2=bill2.findPrice("Puma","skirt",40);
			System.out.println("Item price is "+price2);
			
			Bill bill3=new Bill();
			int price3=bill3.findPrice("Reebok","tshirt",36);
			System.out.println("Item price is "+price3);
			
			Bill bill4=new Bill();
			int price4=bill4.findPrice("Reebok","skirt",46);
			System.out.println("Item price is "+price4);
	}
}
