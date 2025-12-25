package tp1;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletConnection
 */
public class ServletConnect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw  =  response.getWriter();
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title> Exercice 2 Connection </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<form method ='post' action = 'ServletConnect' >");
		pw.println("<label> login : </label>");
		pw.println("<input type = 'text' name = 'login'><br>");
		pw.println("<label> password : </label>");
		pw.println("<input type = 'password' name = 'password'><br>");
		pw.println("<input type = 'submit' value = 'connexion'><br>");
		pw.println("</form>");
		pw.println("<form method ='post' action = '"+request.getContextPath()+"' >");
		pw.println("<input type = 'submit' value = 'Retour' ><br>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		
		
		PrintWriter pw = response.getWriter();
		
		
		
		if((login.equals("fares") && password.equals("mdp")) || ( login.equals("fathi") && password.equals("pwd")) &&
				!login.isEmpty() && !password.isEmpty()) {
			
			
			session.setAttribute("logina", login);
			
			response.sendRedirect(request.getContextPath()+"/ServletWelcome");
			
		}else {
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<title> Exercice 2 Connection </title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<h1> login ou mot de passe incorrect</h1>");
			pw.println("</body>");
			pw.println("</html>");
			
		}
		
		
	}

}
