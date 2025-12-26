package tp1duo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class ServletRecettes
 */
public class ServletRecettes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRecettes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		try {
			
			ArrayList<Recettes> recettes = LectureEcritureTable.read();
			
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<meta charset=\"UTF-8\">");
			pw.println("<title> Recettes</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<table border=\"1\" cellpadding=\"5\">");
			pw.println("<thead>");
			pw.println("<tr>");
			pw.println("<th scope='col'>Id</th>");
			pw.println("<th scope='col'>Nom</th>");
			pw.println("<th scope='col'>tempsPreparation</th>");
			pw.println("<th scope='col'>tempsCuisson</th>");
			pw.println("<th scope='col'>nbParts</th>");
			pw.println("<th scope='col'>Description</th>");
			pw.println("<th scope='col'>idType</th>");
			pw.println("<th scope='col'>Date de Creation</th>");
			pw.println("</tr>");
			pw.println("</thead>");
			pw.println("<tbody>");
			
			for(Recettes r: recettes) {
				
				pw.println("<tr>");
				pw.println("<td scope = 'row'>"+r.getId()+"</td>");
				pw.println("<td scope = 'row'>"+r.getNom()+"</td>");
				pw.println("<td scope = 'row'>"+r.getTempsPreparation()+"</td>");
				pw.println("<td scope = 'row'>"+r.getTempsCuisson()+"</td>");
				pw.println("<td scope = 'row'>"+r.getNbParts()+"</td>");
				pw.println("<td scope = 'row'>"+r.getDescription()+"</td>");
				pw.println("<td scope = 'row'>"+r.getIdType()+"</td>");
				pw.println("<td scope = 'row'>"+r.getDateInsertion()+"</td>");
				pw.println("</tr>");
			}
			pw.println("</tbody>");
			pw.println("</table>");
			pw.println("<a href='index.html'>Page d'acceuil</a>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
