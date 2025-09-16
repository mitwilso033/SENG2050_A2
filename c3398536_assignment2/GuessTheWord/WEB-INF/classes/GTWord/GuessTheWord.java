package classes.GTWord;

import java.nio.file.*;
import java.io.*;
import java.util.*;

//GuessTheWord class, game logic.

public class GuessTheWord {

	public GuessTheWord() {
		String filename = "apache-tomcat-9.0.86/webapps/GuessTheWord/WEB-INF/classes/input.txt"; //path to txt file.
		Path path = Paths.get(filename.toString());
		String temporary[] = new String[100];
		String newarr[];
		Random random = new Random();
		Scanner s = new Scanner(System.in);

		String hiddenword; //declaring storage for the two word types.
		String displayword;


		int counter=0;
		try{
			InputStream input = Files.newInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));


			String word = null;

			while((word=reader.readLine()) != null) {

				temporary[counter] = word;
				++counter;
			}

			newarr = new String[counter];
			newarr = temporary;

			hiddenword = newarr[random.nextInt(counter)];
			displayword = hiddenword;

			for(int x=0; x<hiddenword.length();x++) {

				displayword = displayword.replace(displayword.charAt(random.nextInt(displayword.length())),'?'); //for the length of the displayed word, randomly select character to replace with a ?

			}

			boolean isTrue = true;
			boolean found = false;

			do{	
				System.out.println("\n" + displayword.toUpperCase() + "\n\n");

				System.out.print("Enter a letter to guess:");
				String guess = s.nextLine();

				if(guess.length()> 1) { //comparing guess value to the word
					if(guess.equalsIgnoreCase(hiddenword)){
						System.out.println("You guessed correctly!!");
						System.exit(0);
					}else{
						System.out.println("Wrong. Try Again.");
					}


				}else{
					found = false;
					for(int x=0;x<hiddenword.length()-2;x++){
						if(guess.equalsIgnoreCase(String.valueOf(hiddenword.charAt(x)))) {
							//char chr = guess.charAt(0);
							displayword = displayword.substring(0,x) + guess + displayword.substring(x+1);

						}
					}
				}

				if(found == true) {
					System.out.println(guess.toUpperCase() + " is found in the word!");  //changing response to default to uppercase, if the letter is true, printing message.

				}else {
					System.out.println(guess.toUpperCase() + " is not in the word!");
				}

			}while(true);

			

		}catch(IOException ex){

		}
	}

	public static void main(String[]args){
		new GuessTheWord();
	}

	public void makeGuess(String guess) {
		
		throw new UnsupportedOperationException(" 'makeGuess'");
	}

    public String getDisplayWord() {
     
        throw new UnsupportedOperationException(" 'getDisplayWord'");
    }

    public String getMessage() {

        throw new UnsupportedOperationException(" 'getMessage'");
    }

}