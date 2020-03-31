//9.
public class App {

	public static void main(String[] args) {
		
		//10 & 11.
		Logger logger = new AsteriskLogger();
		
		logger.log("Desmond");
		
		Logger logger1 = new AsteriskLogger();
		
		logger1.error("Please relax this will be resolved soon");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("AppleWatch");
		
		Logger logger3 = new SpacedLogger();
		
		logger3.error("DESTROY");
		
	}

}
