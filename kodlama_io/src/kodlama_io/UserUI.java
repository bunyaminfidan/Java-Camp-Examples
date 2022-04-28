package kodlama_io;

public class UserUI {

	StudentManager studentManager;

	public UserUI(StudentManager studentManager) {

		this.studentManager = studentManager;
	}

	public void defgButton(User user) {

		studentManager.add(user);
		studentManager.update(user);
		studentManager.delete(user);
		studentManager.abcdegs(user);

	}

}
