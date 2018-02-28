import java.util.Scanner;
import java.util.Random;

public class Hangman {

	public static void main(String[] args) {
 		
		Scanner keyboard = new Scanner(System.in);
		
		String[] words = {"hello", "fluffy", "introspective", "computer", "binary", "hexadecimal"};
		
		int missedGuesses = 0;
		boolean gotIt = true;

		Random randomIndex = new Random();
		
		while(gotIt) {

			int randWordIndex = randomIndex.nextInt(words.length);
			String chosenWord = words[randWordIndex];
			char[] randomWord = chosenWord.toCharArray();
			StringBuilder b = new StringBuilder(randomWord.length);
   		
			for(int i=0; i < chosenWord.length(); i++) {
        			b.append("*");
			}	
    		
			while(b.toString().contains("*")){
        			System.out.print("Guess a letter " + b.toString() + " >");
        		
				String guess = keyboard.next();
				if(guess.length() == chosenWord.length()) {
					if(guess.equalsIgnoreCase(chosenWord)) {
						char[] guessChar = guess.toCharArray();
						for(int i=0; i < randomWord.length; i++) {
            						if(Character.toLowerCase(guessChar[i]) == Character.toLowerCase(randomWord[i])) {
                						b.setCharAt(i, guessChar[i]);
							}	
        					}

					} else {
						char[] guessChar = guess.toCharArray();
						for(int i=0; i < randomWord.length; i++) {
            						if(Character.toLowerCase(guessChar[i]) == Character.toLowerCase(randomWord[i])) {
                						b.setCharAt(i, guessChar[i]);
							}	
        					}
						++missedGuesses;
						System.out.println("NOPE, Guesses: " + missedGuesses);
						System.out.println();
					}

        			} else if(guess.length() == 1) {
					char guessChar = guess.toCharArray()[0];
					for(int i=0; i < randomWord.length; i++) {
            					if(Character.toLowerCase(guessChar) == Character.toLowerCase(randomWord[i])) {
                					b.setCharAt(i, guessChar);
						} 
        				}
					++missedGuesses;
					System.out.println("NOPE Guesses: " + missedGuesses);
					System.out.println();

				} else {
					System.out.println("Your word guess is not the right length");
					++missedGuesses;
					System.out.println("Guesses: " + missedGuesses);
					System.out.println();
				}
			}
			System.out.println("You got it, the word is: " + chosenWord);
			System.out.println();
			System.out.println("Do you want to play again? If yes enter yes, otherwise enter no");
			String response = keyboard.next();
			if(response.equalsIgnoreCase("yes")) {
				gotIt = true;
			} else {
				gotIt = false;
			}
		}
	}
}	

		/*
		while((missedGuesses <= 3) && (gotIt == false)) {

			int randWordIndex = randomIndex.nextInt(words.length);
			System.out.println(randWordIndex);

			char[] randomWord = new char[words[randWordIndex].length()];

			String chosenWord = words[randWordIndex];

		StringBuilder b = new StringBuilder(randomWord.length);

}
*/




	/*
	public static void main(String[] args) {

//      pick a random string value from string[]
        String[] words = {"write", "that", "program", "telephone"};
        int y = (int) (Math.random() * 4);
        String word = words[y];
//      create equal length string with asterisks
        String maskWord = word.replaceAll(".","*");
        int count = 0;
        int letterPosition = 0;
//      convert int value to character PROBLEM!!!
        char guessedLetter = (char) (letterPosition + '0');
        Scanner input = new Scanner(System.in);

//      guess a letter, let loop run until all *'s have been replaced
        while (maskWord.contains("*")) {
            System.out.print("(Guess) Enter a letter in word " + maskWord + " >");
            String guessWord = input.nextLine();
//          if guessed letter is part of word, replace asterisks in maskWord with guessed letter at correct position
            if (word.contains(guessWord)) {
                letterPosition = word.indexOf(guessWord);
                maskWord.replace(maskWord.charAt(guessedLetter), guessWord);
            }
//          if guessed letter is not part of word, error counter +1
            else {
                System.out.println(guessWord + " is not in the word");
                count += 1;
            }

        }
    }
//          to ask for another game, put all code in boolean yes/no loop
}
*/





	/*
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		String[] words = {"hello", "fluffy", "introspective", "computer", "binary", "hexadecimal"};
		
		int missedGuesses = 0;
		boolean gotIt = false;

		Random randomIndex = new Random();

		while((missedGuesses <= 3) && (gotIt == false)) {

			int randWordIndex = randomIndex.nextInt(words.length);
			System.out.println(randWordIndex);

			char[] randomWord = new char[words[randWordIndex].length()];

			String chosenWord = words[randWordIndex];

		StringBuilder b = new StringBuilder(randomWord.length);

		for(int i=0; i<randomWord.length; i++) {
			b.append("*");
		}

		System.out.print("Guess a letter in the word > " + b);

		for(int i=0; i<chosenWord.length(); i++) {
			randomWord[i] = chosenWord.charAt(i);
		}
		System.out.println(randomWord);
		for(int i=0; i<randomWord.length; i++) {
			System.out.print(
		}
		}
	}
	
}
*/
