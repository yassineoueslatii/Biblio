package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Auteur;
import beans.Livre;
import dao.AuteurDao;
import dao.IAuteurDao;
import dao.ILivreDao;
import dao.LivreDao;

/**
 * Servlet implementation class AjoutServlet
 */

@WebServlet("/ajout")
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/fichierweb/ajoutlivre.jsp").forward(request, response);
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livre l1 = new Livre();
		Auteur auteur1 = new Auteur();
		
		l1.setIsbn(Integer.parseInt(request.getParameter("isbn")));
		l1.setCategorie(request.getParameter("categorie"));
		l1.setTitre(request.getParameter("titre"));
		
		auteur1.setNom(request.getParameter("nomAuteur"));
		auteur1.setPrenom(request.getParameter("prenomAuteur"));
		
		request.setAttribute("livre", l1);
		request.setAttribute("auteur", auteur1);
		ILivreDao livre = new LivreDao();
		IAuteurDao auteur = new AuteurDao();
		int a =livre.saveLivre(l1);
		int b= auteur.saveAuteur(auteur1);
		if (a==1 && b==1)
		{
			request.setAttribute("message", "Ajout validé");
		}
		else request.setAttribute("message", "Echec de l'ajout :(");
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/fichierweb/confirmation.jsp").forward(request, response);
	}

}
