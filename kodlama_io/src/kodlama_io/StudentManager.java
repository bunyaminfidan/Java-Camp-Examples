package kodlama_io;

public class StudentManager extends UserManager {

	public void registerCourse(User user) {
		System.out.println("Seçili kursa ögrenci kayıt oldu: " + user.getFirstName() + " " + user.getLastName());
	}

}
