package kodlama_io;

public class InstructorManager extends UserManager {
	
	public void createdCourse(User user) {
		System.out.println("Eðitmen yeni kurs ekledi: "+ user.getFirstName() + " "+ user.getLastName());
	}

}
