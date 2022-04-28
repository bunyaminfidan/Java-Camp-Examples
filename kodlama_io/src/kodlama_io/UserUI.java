package kodlama_io;

public class UserUI {

	StudentManager studentManager = new StudentManager();

	public void registerCourseButton(User user) {

		studentManager.add(user);
		studentManager.update(user);
		studentManager.delete(user);
		studentManager.registerCourse(user);

	}

}
