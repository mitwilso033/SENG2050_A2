
MVC, Application Structure, Session Tracking & Game Saving.

Application Structure:

GameServlet.java: This servlet does the HTTP POST requests from the game form, taking the user's guess and then using the GuessTheWord object it takes the request to game.jsp so that it can be displayed on the game interface. It has three objects: GameServlet, GuessTheWord, and GuessTheWordBean.

GuessTheWordBean.java: This is a java bean class that holds the displayable word and the messages that are shown in game.jsp with the object GuessTheWordBean that has the properties to store the display word and letters.

GuessTheWord.java: This class has the logic of the game. It has the guesses from the user, and the correct word. Implements a ? Randomly through the length of the word, reading from a .txt file. Objects GuessTheWord90 represents the game logic and functions. 

Game.jsp: This is the interface of the game that is displayed to the user, with the HTML forms for submitting guesses. GuessTheWord() object retrieved from the session to access the game state.

Error.jsp: Used to display error messages if there are any errors.

Session Tracking and game saving:

HttpSession is used to track the users session because when the user starts a game, a new session is created and the GuessTheWord object is stored in the HttpSession. The game is saved while the session is active in the browser.


MVC Model:

Model: GuessTheWord.java has the logic for the game, initialising it, managing the guesses and updating the word (displayWord) when the user submits a guess that is correct.

View: Game.jsp acts as the view component of the MVC architecture as it handles the HTTP requests while containing the HTML for inputs from the user and displays the logic of the game.

Controller: GameServlet.java is the controller in this, as it handles the HTTP requests, takes the user's input and updates the game state acting as the mediator between the different pages. It controls where the user's input and information goes.

