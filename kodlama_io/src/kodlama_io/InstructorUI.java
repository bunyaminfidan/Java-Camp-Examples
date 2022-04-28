package kodlama_io;

public class InstructorUI {

	InstructorManager instructorManager = new InstructorManager();

	StudentManager studentManager = new StudentManager();

	public void createdCourseButton(User user) {

		instructorManager.add(user);
		instructorManager.update(user);
		instructorManager.delete(user);
		instructorManager.createdCourse(user);

	}

}
