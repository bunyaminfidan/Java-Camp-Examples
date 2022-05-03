package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	JLoggerManager jLoggerManager = new JLoggerManager();
	@Override
	public void LogToSystem(String message) {
		jLoggerManager.log("JLogger ile loglandý: "+message);
		
	}

}
