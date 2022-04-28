package kodlama_io;

public class User {

	private int id;
	private String email;

	public User() {
		super();
	}

	public User(int id, String firstName, String lastName, String email, String identityNumber) {
		super();
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
