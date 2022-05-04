package eCommerceDemo.core.utilities.log;

import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;

public class EmailLogManager implements LogService {

	@Override
	public void log(String message) {
		PrintlnShortcut.printlnShortcut("Email gönderildi : "+ message);
		
	}

}
