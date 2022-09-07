package interface_assignment;

public class MobileMain {

	public static void main(String[] args) {
	
		Mobile mobile=new Mobile("Mobile","OnePlus","Saturn","1.3");
		
		SmartPhone smartPhone=new SmartPhone("KrillinM20","Nebula","Saturn","1.3", "4G");
		smartPhone.display(smartPhone);
		
		SmartPhone smartPhone1=new SmartPhone("KrillinM20","Nebula","Quasar","1.3", "4G");
		smartPhone1.display(smartPhone1);
		
		SmartPhone smartPhone2=new SmartPhone("KrillinM20","Nebula","Gara","EXRT.2", "4G");
		smartPhone2.display(smartPhone2);
		
	}

}
