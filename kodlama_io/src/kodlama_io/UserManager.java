package kodlama_io;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getId());
	}

	public void update(User user) {
		System.out.println("Kullanıcı güncellendi : " + user.getId());
	}

	public void delete(User user) {
		System.out.println("Kullanıcı silindi : " + user.getId());
	}

}
