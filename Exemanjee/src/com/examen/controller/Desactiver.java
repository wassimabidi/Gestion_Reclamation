package com.examen.controller;

import java.io.IOException;
import java.util.List;

import com.examen.entities.Etudiant;
import com.examen.service.AuthentificationServiceLocal;
import com.examen.service.ReclamationServiceLocal;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Desactiver
 */
@WebServlet("/Desactiver")
public class Desactiver extends HttpServlet {
	private static final long serialVersionUID = 1L;
ServletContext context ;
	
	@EJB private AuthentificationServiceLocal metierAuthentification;
	@EJB private ReclamationServiceLocal metierReclamation;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Desactiver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		context=request.getSession().getServletContext();
		List<Etudiant> listeEtudiants=metierAuthentification.listerEtudiants();
		context.setAttribute("listeEtudiants", listeEtudiants);
		request.getRequestDispatcher("WEB-INF/Desactiver.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		context= (ServletContext) request.getSession().getServletContext();
		doGet(request, response);
		List<Etudiant> listeEtudiants=metierAuthentification.listerEtudiants();
		String action=request.getParameter("action"); 
		 
		if(action.equals("Update"))
		{
			String nom = request.getParameter("nom");
			String  prenom = request.getParameter("prenom");
			metierAuthentification.désactiverCompte(nom,prenom);
	}

	}
	}
