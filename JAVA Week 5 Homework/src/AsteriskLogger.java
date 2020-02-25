//3.
public class AsteriskLogger implements Logger {
	

		//4.
		@Override
		public void log(String Hello) {
			System.out.println("***" + Hello + "***");
		
		
	}
		//5.
		@Override
		public void error(String error) {
		
			for (int i = 0; i < 16 + error.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
			
			System.out.println("***Error: " + "Please relax this will be resolved soon" + "***");
			for (int i = 0; i < 16 + error.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			
		
		
			
	
	}
	
	


		

	
		
	






