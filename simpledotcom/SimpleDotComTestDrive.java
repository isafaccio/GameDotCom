public class SimpleDotComTestDrive {
	public static void main (String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "2";
			testResult = dot.checkYourself (userGuess);
			String result = "failed";
			if (result.equals("hit")){
				testResult = "passed";
			}
			System.out.println(testResult);	
	}
}