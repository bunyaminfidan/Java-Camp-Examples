package kodlama_io;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getId());
	}

	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : " + user.getId());
	}

	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getId());
	}

}
