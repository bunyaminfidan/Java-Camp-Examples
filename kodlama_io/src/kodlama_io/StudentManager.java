package kodlama_io;

public class StudentManager extends UserManager {

	public void registerCourse(User user) {
		System.out.println("Se�ili kursa �grenci kay�t oldu: " + user.getFirstName() + " " + user.getLastName());
	}

}
