package classes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet; //imports
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.GTWord.GuessTheWord; //importing the GuesstheWord class and the Bean class.
import classes.GTWord.GuessTheWordBean;

@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//handling Post requests, getting user input (guess)
		HttpSession session = request.getSession(true);
		String guess = request.getParameter("guess");

		GuessTheWord game = (GuessTheWord) session.getAttribute("game"); //creates a new instance of the guessTheWord class.
    if (game == null) {
        game = new GuessTheWord();
        session.setAttribute("game", game);
    }

    		game.makeGuess(guess);
		request.getRequestDispatcher("game.jsp").forward(request, response); 

		game.makeGuess(guess);
		GuessTheWordBean gameBean = new GuessTheWordBean();

		gameBean.setDisplayWord(game.getDisplayWord()); //setting the displayword and message propety of GuessTheWordBean.
		gameBean.setMessage(game.getMessage());
		request.setAttribute("gameBean", gameBean);
		request.getRequestDispatcher("game.jsp").forward(request, response); //sending the request to game.jsp

	}

}