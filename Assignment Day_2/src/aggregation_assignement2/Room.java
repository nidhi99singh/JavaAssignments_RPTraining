package aggregation_assignement2;

public class Room {

	private int roomNumber;
	private int capacity=4;
	private static int roomCounter;
	
	static {
		roomCounter=500;
	}
	
	public Room() {
		roomCounter++;
		setRoomNumber(roomCounter);
	}
	public int getRoomNumber() {
		return roomNumber;
	}
		public static int getRoomCounter() {
		return roomCounter;
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
		public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void display() {
		System.out.println("Room number: "+getRoomNumber());
		System.out.println("capacity : "+getCapacity());
	}
}
