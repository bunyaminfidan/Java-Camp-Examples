package kodlama_io;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getId());
	}

	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi : " + user.getId());
	}

	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.getId());
	}

}
