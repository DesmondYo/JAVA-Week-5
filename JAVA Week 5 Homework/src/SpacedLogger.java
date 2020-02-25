
public class SpacedLogger implements Logger {
	
	//6 & 7.
	@Override
	public void log(String AppleWatch) {
		
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < AppleWatch.length(); i++) {
			log.append(AppleWatch.charAt(i) + " ");
		}
		System.out.println(log);
	
	}
	
	//8.
	@Override
	public void error(String Destroy) {
		System.out.println("ERROR: ");
		log (Destroy);
		
	}


		
		
	}


