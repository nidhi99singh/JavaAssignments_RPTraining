package final_assignment;

public class Student {

	private final int stipend=100;
	private int studentId;
	private int aggregateMarks;
	
	public Student(int studentId, int aggregateMarks) {
		super();
		this.studentId = studentId;
		this.aggregateMarks = aggregateMarks;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getStipend() {
		return stipend;
	}
	
	public int additionalStipend() {
		if(aggregateMarks>=85 && aggregateMarks<90) {
			return 10;
		}
		if(aggregateMarks>=90 && aggregateMarks<95) {
			return 15;
		}
		if(aggregateMarks>=95 && aggregateMarks<=100) {
			return 20;
		}
		return 0;
	}
	public int calculateTotalStipend() {
		int total=additionalStipend()+stipend;
		return total;
	}
}
