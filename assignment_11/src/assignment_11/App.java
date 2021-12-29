package assignment_11;

import ignore.TestingUtils;

public class App {


	/**

	Given a string, return a string where for every char in the original, append another. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatChar("The")  <b>---></b>"TThhee"<br>
		repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
		repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */
	
	public static String repeatChar(String str) {
		String s="";
		for(int i = 0; i<str.length();i++){
			s+=String.valueOf(str.charAt(i));
			s+=String.valueOf(str.charAt(i));
		}
		return s;
		
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
