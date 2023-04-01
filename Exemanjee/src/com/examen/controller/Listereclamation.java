package com.examen.controller;

import java.io.IOException;
import java.util.List;

import com.examen.entities.Etudiant;
import com.examen.entities.Reclamation;
import com.examen.entities.TypeReclamation;
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
 * Servlet implementation class Service
 */
@WebServlet("/Listereclamation")
public class Listereclamation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context;
	@EJB private ReclamationServiceLocal metierreclamation;
	@EJB private AuthentificationServiceLocal metierEtudiant;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listereclamation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	response.getWriter().append("Served at: ").append(request.getContextPath());
		context= request.getSession().getServletContext();
		List<Reclamation> listReclamation=metierreclamation.listerReclamations();
		List<Etudiant>listerEtudiant=metierEtudiant.listerEtudiants();
		List<TypeReclamation>listerTypeReclamation=metierreclamation.listerTypeReclamations();
		context.setAttribute("listReclamation",listReclamation);
		context.setAttribute("listerEtudiant",listerEtudiant);
		context.setAttribute("listerTypeReclamation",listerTypeReclamation);
		request.getRequestDispatcher("WEB-INF/listerec.jsp").forward(request, response);
	}

}
