import java.util.Scanner;
class Order{
	private String choice;
	private int quantity;
	private float distance;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	@Override
	public String toString() {
		return "Order Details: [choice=" + choice + ", quantity=" + quantity + ", distance=" + distance + "]";
	}

	public float totalBill() {
		int cost=0;
		float total;
		float distanceCost;
		
		if((getChoice().equals("V")||getChoice().equals("N"))&& getQuantity()>=1 && getDistance()>0) {
			if(getChoice().equals("V")) {
				cost=12;
			}
			if(getChoice().equals("N")) {
				cost=15;
			}
			if(getDistance()<=3) {
				distanceCost=0;
			}
			
			else if(getDistance()>3 && getDistance()<=6) {
					float distance=getDistance()-3;
					distanceCost=distance*1;	
			}
			else{
					distanceCost=(getDistance()-3)*1;
					float distance=getDistance()-6;
					distanceCost=distanceCost+distance*1;	
			}
			
			total=(cost*getQuantity())+(distanceCost);
			return total;
		
		}else {
			 if(getDistance()<=0) {
				System.out.println("distance must be greater than 0");
			}
			if(getQuantity()<1) {
				System.out.println("quantity should be atleast 1");}
			total=-1;
			return total;
		}
	}
	
}

public class FoodCorner {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	Order order=new Order();
	System.out.println("Enter Choice of food 'V' for vegetarian 'N' for non-vegetarian");
	String choice=sc.nextLine();
	order.setChoice(choice);
	System.out.println("enter quantity of plates : ");
	int quantity=sc.nextInt();
	order.setQuantity(quantity);
	System.out.println("enter your distance");
	float distance=sc.nextInt();
	order.setDistance(distance);
	
	System.out.println(order.toString());
	float total=order.totalBill();
	System.out.println("total Bill :"+total);
	
	}
}
