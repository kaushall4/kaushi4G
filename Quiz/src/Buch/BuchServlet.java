package Buch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import el.Adresse;
import el.Person;

/**
 * Servlet implementation class BuchServlet
 */
@WebServlet("/BuchServlet")
public class BuchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuchServlet() {
        super();
        list.add( new Buch(200, "Fantasie", new Adresse("Stadelhofeumestrasse 21")));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=0;
	String title = "";
	if(request.getParameter("id") !=null)
		id= Integer.parseInt(request.getParameter("id"));
	if (request.getParameter("title")!=null)
		title = request.getParameter("title");
	
//
	Simple
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		
		request.setAttribute("Buch", b);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
