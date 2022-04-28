package kodlama_io;

public class Main {

	public static void main(String[] args) {

		Student bunyamin = new Student();
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");
		bunyamin.setIdentityNumber("111111");
		bunyamin.setEmail("bb@gmail.com");
		bunyamin.setUserId(11);

		Instructor engin = new Instructor();
		engin.setId(2);
		engin.setFirstName("Engin");
		engin.setLastName("Demirog");
		engin.setIdentityNumber("22222");
		engin.setEmail("ee@gmail.com");
		engin.setUserId(22);

		UserUI userUI = new UserUI(new StudentManager());
		userUI.defgButton(bunyamin);

		System.out.println("--------------");

		InstructorUI instructorUI = new InstructorUI(new InstructorManager());
		instructorUI.abcButton(engin);

	}

}
