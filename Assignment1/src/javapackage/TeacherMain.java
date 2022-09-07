package javapackage;

public class TeacherMain {

	public static void main(String[] args) {
	Teacher teacher1=new Teacher("Garima","Economics",250000);
	Teacher teacher2=new Teacher("John","Java",35000);
	Teacher teacher3=new Teacher("Mary","English",20000);
	Teacher teacher4=new Teacher("Neha","Maths",35000.58d);
	Teacher teacher5=new Teacher("Rohan","Hindi",45000.45);

	Teacher [] teachers={teacher1,teacher2,teacher3,teacher4,teacher5};
	
	for(int i=0;i<teachers.length;i++) {
		System.out.println("Teacher "+(i+1)+" Details ");
		System.out.println("[Teacher Name:"+teachers[i].getTeacherName()+",Subject:"+teachers[i].getSubject()+",salary:"+teachers[i].getSalary()+"]");
	}
	
	}

}
