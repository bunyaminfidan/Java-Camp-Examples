package kodlama_io;

public class Student  extends User {
	private int studentNo;

	public Student() {
		super();
	}

	public Student(int studentNo) {
		super();
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}
