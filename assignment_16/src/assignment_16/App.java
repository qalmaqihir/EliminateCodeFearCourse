package assignment_16;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, compute recursively (no loops) the number of times 
		lowercase "yo" appears in the string.
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		yoYo("xhyoxx") <b>---></b> 1<br>
		yoYo("nyonnyon")<b>---></b> 2 <br>
		yoYo("yo")  <b>---></b> 1 <br>
	 */
	
	public static int yoYo(String str) {
		if(str.length()<2){
			return 0;
		}
		if(str.substring(0,2).equals("yo")){
			return 1+ yoYo(str.substring(1));
		}else {
			return yoYo(str.substring(1));
		}
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

