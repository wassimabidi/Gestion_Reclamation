package com.examen.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.examen.entities.Etudiant;
import com.examen.entities.Reclamation;
import com.examen.service.AuthentificationServiceLocal;
import com.examen.service.ReclamationServiceLocal;

/**
 * Servlet implementation class AjoutEtudiant
 */
@WebServlet("/AjoutEtudiant")
public class AjoutEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServletContext context ;
	
	@EJB private AuthentificationServiceLocal metierAuthentification;
	@EJB private ReclamationServiceLocal metierReclamation;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		context=request.getSession().getServletContext();
		List<Etudiant> listeEtudiants=metierAuthentification.listerEtudiants();
		   List<Reclamation> listeReclamations=metierReclamation.listerReclamations();
			  context.setAttribute("listeEtudiants", listeEtudiants);
					context.setAttribute("listeReclamations",listeReclamations);
					request.getRequestDispatcher("WEB-INF/AjoutEtundiant.jsp").forward(request, response);
			    }

	/**
	 * @throws jakarta.servlet.ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
		context= (ServletContext) request.getSession().getServletContext();

		doGet(request, response);
		
		
		
List<Etudiant> listeEtudiants=metierAuthentification.listerEtudiants();
		
		String action=request.getParameter("action"); 
		 
			if(action.equals("ajouter"))
		
			{ 
				
				Integer id= Integer.parseInt(request.getParameter("id"));
				String email= request.getParameter("email");
				String  password=request.getParameter("password");
				String nom=request.getParameter("nom");
				String prenom=request.getParameter("prenom");
				String type=request.getParameter("type");
				Etudiant etud= new Etudiant();
				etud.setId(id);
				etud.setActif(true);
				etud.setEmail(email);
				etud.setPassword(password);
				etud.setNom(nom);
				etud.setPrenom(prenom);
				metierAuthentification.ajouterEtudiant(etud);
				
				//List<Reclamation> reclamationSelectionnes= metierReclamation.listerReclamationParEtudiant(etud);

	}
	}
}

