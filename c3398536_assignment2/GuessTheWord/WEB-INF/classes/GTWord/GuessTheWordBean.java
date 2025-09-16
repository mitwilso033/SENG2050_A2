
package classes.GTWord; //package instructions


public class GuessTheWordBean {
	private String displayWord; //Bean to hold information from the guess the word game. //displayWord to store the string display word
	private String message; //storing messages

	//getter
	public String getDisplayWord() {
		return displayWord;
	}
	//setter
	public void setDisplayWord(String displayWord) {
		this.displayWord = displayWord;
	}
	//getter for message property
	public String getMessage() {
		return message;

	}
	//setter for messahe property
	public void setMessage(String message) {
		this.message = message;
	}



}