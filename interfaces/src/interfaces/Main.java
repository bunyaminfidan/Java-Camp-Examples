package interfaces;

import javax.xml.crypto.Data;

public class Main {

	public static void main(String[] args) {

		Logger[] log = { new EmailLogger(), new FileLogger(), new DatabaseLogger(), new SmsLogger() };

		CustomerManager customerManager = new CustomerManager(log);

		Customer bunyamin = new Customer();
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");

		customerManager.add(bunyamin);
		
	}

}
