package aggregation_assignement2;

public class RoomsMain {

	public static void main(String[] args) {

		Room room1=new Room();
		Room room2=new Room();
		//member1
		Member member1=new Member(001, "John");
		Member member2=new Member(002, "Rohan");
		Member member3=new Member(003, "kim");
		Member member4=new Member(004,"Tom");
		Member member5=new Member(004,"Nidhi");
		
		Admin admin=new Admin();
		Room [] rooms=new Room[] {room1,room2};
		
		admin.assignRoom(rooms, member1);
		admin.assignRoom(rooms, member2);
		admin.assignRoom(rooms, member3);
		admin.assignRoom(rooms, member4);
		admin.assignRoom(rooms, member5);
		
		
//		if(admin.assignRoom(rooms, member1)) {
//			System.out.println("Room booked successfully!");
//		System.out.println(member1.getName()+" your room number is "+member1.getRoom().getRoomNumber());
//		}
//		else {
//			System.out.println(member1.getName()+" Sorry! no rooms available");
//		}
//		
//		if(admin.assignRoom(rooms, member2)) {
//			System.out.println("Room booked successfully!");
//		System.out.println(member2.getName()+" your room number is "+member2.getRoom().getRoomNumber());
//		}
//		else {
//			System.out.println(member2.getName()+ " Sorry! no rooms available");
//		}
//		
//		if(admin.assignRoom(rooms, member3)) {
//			System.out.println("Room booked successfully!");
//		System.out.println(member3.getName()+" your room number is "+member3.getRoom().getRoomNumber());
//		}
//		else {
//			System.out.println(member3.getName()+ " Sorry! no rooms available");
//		}
//
//		if(admin.assignRoom(rooms, member4)) {
//			System.out.println("Room booked successfully!");
//		System.out.println(member4.getName()+" your room number is "+member4.getRoom().getRoomNumber());
//		}
//		else {
//			System.out.println(member4.getName()+ " Sorry! no rooms available");
//		}
//		
//		if(admin.assignRoom(rooms, member5)) {
//			System.out.println("Room booked successfully!");
//		System.out.println(member5.getName()+" your room number is "+member5.getRoom().getRoomNumber());
//		}
//		else {
//			System.out.println(member5.getName()+ " Sorry! no rooms available");
//		}
	
	}

}
