
public class SpacedLogger implements Logger {
	
	//6 & 7.
	@Override
	public void log(String Message) {
		
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < Message.length(); i++) {
			log.append(Message.charAt(i) + " ");
		}
		System.out.println(log);
	
	}
	
	//8.
	@Override
	public void error(String Message) {
		System.out.print("Error: ");
		log (Message);
		
	}


		
		
	}


