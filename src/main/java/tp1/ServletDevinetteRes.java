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
 * Servlet implementation class ServletDevinetteRes
 */
public class ServletDevinetteRes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDevinetteRes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		
		int n = Integer.parseInt(nombre);
		
		HttpSession session = request.getSession(false);
		
		Integer nbADeviner = (Integer) session.getAttribute("nbADeviner");
		
		
		
		if(n == nbADeviner) {
			session.setAttribute("message", "bien joue, cherche un nouveau nombre");
			session.removeAttribute("nbADeviner");
			response.sendRedirect(request.getContextPath()+"/ServletDevinette");
		}
		else if(n<nbADeviner) {
			session.setAttribute("message", "plus");
			response.sendRedirect(request.getContextPath()+"/ServletDevinette");
		}
		else if(n>nbADeviner) {
			session.setAttribute("message", "moins");
			response.sendRedirect(request.getContextPath()+"/ServletDevinette");
		}
		
		
		
		
	}

}
