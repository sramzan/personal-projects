package leetCode;

public class NumberIdentifier {

	public static void main(String[] args) {
		String test = "9";
		byte[] barr = test.getBytes();
		for (byte b : barr)
			System.out.println(b);
		
		/*
		 * Initial try using byte code:
		 * 	        byte[] arrOfBytes  = s.getBytes();
         *			Boolean prevWasInt = false;
         *			Boolean prevWasE   = false;
         *
 		 *	        for (byte b : arrOfBytes){
 		 *	            if (b >= 48 && b <= 57){
		 *	                prevWasInt = true;
		 *	                return true;
         *			}
		 */
		
	}

}
