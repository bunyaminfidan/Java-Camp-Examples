package kodlama_io;

public class InstructorUI {

	InstructorManager instructorManager;

	public InstructorUI(InstructorManager instructorManager) {

		this.instructorManager = instructorManager;
	}

	public void abcButton(User user) {

		instructorManager.add(user);
		instructorManager.update(user);
		instructorManager.delete(user);
		instructorManager.abc(user);

	}

}
