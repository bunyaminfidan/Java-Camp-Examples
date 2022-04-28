package kodlama_io;

public class Instructor extends User {

	private int InstructorNo;

	public Instructor() {
		super();
	}

	public Instructor(int instructorNo) {
		super();
		InstructorNo = instructorNo;
	}

	public int getInstructorNo() {
		return InstructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		InstructorNo = instructorNo;
	}

}
