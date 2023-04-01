package com.examen.controller;





import java.io.IOException;
import java.util.List;

import com.examen.entities.Administrateur;
import com.examen.entities.Etudiant;
import com.examen.entities.Utilisateurs;
import com.examen.service.AuthentificationServiceLocal;


import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Authentification")
public class authentifier extends HttpServlet {
	@EJB private AuthentificationServiceLocal metierAuthentification;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/authentification.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String  password = request.getParameter("password");
		String alertMessage = " ";
		
		String action=request.getParameter("action"); 
		if(action.equals("ajouter"))
		{
			if(email == "" && password == "")
			{
			request.setAttribute("alertMessage", alertMessage);
		  	request.getRequestDispatcher("/WEB-INF/authentification.jsp").forward(request, response);
			 }
			Utilisateurs user =metierAuthentification.authentifier(email,password);
			
			if(user instanceof Etudiant)
			{
				response.sendRedirect("http://localhost:8080/Exemanjee/AjoutReclamation");
				
			}
			else if(user instanceof Administrateur)
			{
		
				response.sendRedirect("http://localhost:8080/Exemanjee/Service");
			}
			else 
			{
				response.sendRedirect("http://localhost:8080/Exemanjee/Authentification");
			}
			}
		}
		
		
	}

		
		
		
		

	
	



