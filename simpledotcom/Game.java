public static void main(String[] args) {
	int numOfGuesses = 0;
	GameHelper helper = new GameHelper();
	SimpleDotCom theDotCom = new SimpleDotCom();
	int randomNum = (int) (math.random() * 5);
	int []locations = {randomNum+1, randomNum+2};
	theDotCom.setLocationCells(locations);
	boolean isAlive = true;
	while (isAlive == true) {
	String Guess = helper.getUserInput("insira um numero");
	String result = theDotCom.checkYourself(Guess);
	NumOfGuesses++;
	if (result.equals("kill")){
		IsAlive = false;

		System.out.println("Voce usou"+ numOfGuesses +");
	}
	}
}