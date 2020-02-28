package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Livre;
import dao.ILivreDao;
import dao.LivreDao;

/**
 * Servlet implementation class supri
 */
@WebServlet("/supri")
public class supri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public supri() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Livre> liste = new ArrayList<Livre>();
		ILivreDao dao = new LivreDao();
		liste = dao.getLivres();
		request.setAttribute("livres", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/fichierweb/removeliv.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ILivreDao dao = new LivreDao();
		dao.suprimLivre(Integer.parseInt(request.getParameter("id_livre")));
		this.getServletContext().getRequestDispatcher("/livres").forward(request, response);
		
	}

}
