package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
		String result = "";
		int len = str.length();
		int i=0, j=i+1;
		for (int k=0;k<len;k++){
			if(str.charAt(i)!='*' && str.charAt(j)!='*'){
				result+=str.charAt(i);
				i++;
			}
			if(str.charAt(i)=='*' && str.charAt(j)=='*'){
				i=i+2;
				j++;
			}
		}
		return result;
	}


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
