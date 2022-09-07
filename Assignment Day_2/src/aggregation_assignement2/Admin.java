package aggregation_assignement2;

public class Admin {
	
	public void assignRoom(Room [] room, Member member) {
		
		for(int i=0;i<room.length;i++) {
			if(room[i].getCapacity()>0)
			{
				member.setRoom(room[i]);
				System.out.println(member.getName()+"your room number is "+room[i].getRoomNumber());
				room[i].setCapacity(room[i].getCapacity()-1);
				break;
			}else {
				continue;
			}			
		}
	}

}
