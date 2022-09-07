package com.day2;

public class ParticipantsMain {

	public static void main(String[] args) {
	
		Participants participant=new Participants(Participants.generateId(),"Frankin",123456789,"LA");
		participant.display();
//		System.out.println(participant.toString());
		
		Participants participant1=new Participants(Participants.generateId(),"Martina",123456789,"Jaipur");
		participant1.display();
//		System.out.println(participant.toString());
		}

}
