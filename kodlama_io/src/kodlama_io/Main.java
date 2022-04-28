package kodlama_io;

public class Main {

	public static void main(String[] args) {

		Student bunyamin = new Student();
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");
		bunyamin.setIdentityNumber("111111");
		bunyamin.setEmail("bb@gmail.com");
		bunyamin.setStudentNo(11);

		Instructor engin = new Instructor();
		engin.setId(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demirog");
		engin.setIdentityNumber("22222");
		engin.setEmail("ee@gmail.com");
		engin.setInstructorNo(22);

		UserUI userUI = new UserUI();
		userUI.registerCourseButton(bunyamin);

		System.out.println("--------------");

		InstructorUI instructorUI = new InstructorUI();
		instructorUI.createdCourseButton(engin);

	}

}
