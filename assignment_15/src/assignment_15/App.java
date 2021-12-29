package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {

		if(str.length()==1){
			return 0;
		}
		int[] found = new int[str.length()];
		int loop=0;
		int current =0;
		int next = current+1;

		while (next<str.length()){
			while(current<str.length()){
				if(str.charAt(current)==str.charAt(next)){
					found[loop]+=1;
					current++;
				}

			}
			current++;
			loop++;
		}
		int max=0;
		for (int i:found){
			if(i>=max){
				max=i;
			}
		}
		return max;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

