package interfaces;

public class Utils {
	
	//static = New  yapmaya gerek kalm�yor.

	public static void runLoggers(Logger[] loggers, String message) {

		for (Logger logger : loggers) {
			logger.log(message);
		}
	}

}
