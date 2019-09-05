package Ch5PowerMethods;

import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dotCom = new SimpleDotCom();
//        Scanner in = new Scanner(System.in);
        int startPosition = (int)(Math.random() * 5);
        int[] locations = {startPosition, startPosition + 1, startPosition + 2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;
        while(isAlive) {
            String guess = helper.getUserInput("Enter a cell location: ");
            String result = dotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Kill")) {
                isAlive = false;
                System.out.println("It took you " + numOfGuesses + " of guesses to sink a dotCom");
            }
        }
    }
}
