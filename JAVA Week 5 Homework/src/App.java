//9.
public class App {

	public static void main(String[] args) {
		
		//10 & 11.
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		
		Logger logger1 = new AsteriskLogger();
		
		logger1.error("error");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Hello");
		
		Logger logger3 = new SpacedLogger();
		
		logger3.error("Error");
		
	}

}
