package Buch;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuchServlet
 */
@WebServlet("/Buch/BuchServlet")
public class BuchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String titel = request.getParameter("titel");
		String kategorie = request.getParameter("kategorie");
		int seiten = Integer.parseInt(request.getParameter("seiten"));
		String vorname = request.getParameter("vorname");
		String name = request.getParameter("name");
		
		String geb = request.getParameter("geburtsdatum");
		Date geburtsdatum = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,yyyy");
		try {
			geburtsdatum = sdf.parse(geb);
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
		Bibliothek bibliothek = Bibliothek.getBibliothek();
		bibliothek.buecher.add(new Buch("titel", "kategorie", 2,new Autor("JK", "Rowling", 22)));
		request.setAttribute("Buecher", bibliothek.buecher);
		
		RequestDispatcher rd = request.getRequestDispatcher("AntwortBibliothek.jsp");
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
