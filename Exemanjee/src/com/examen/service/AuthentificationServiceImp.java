package com.examen.service;

import java.util.List;

import com.examen.entities.Etudiant;
import com.examen.entities.TypeReclamation;
import com.examen.entities.Utilisateurs;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class AuthentificationServiceImp implements AuthentificationServiceLocal {
	@PersistenceContext(unitName="UPReclamations")
	EntityManager em;

	@Override
	public Utilisateurs authentifier(String email, String pwd) {
		// TODO Auto-generated method stub
		try {
		Query req=em.createQuery("select e from Utilisateurs e where e.password=:pwd AND e.email=:email");
		req.setParameter("email",email);
		req.setParameter("pwd",pwd);
	
		
		Utilisateurs ut=(Utilisateurs) req.getSingleResult();
		 
		return ut;
		
		  }
		catch(NoResultException e){return null;}
		
		
		
		
	}

	@Override
	public boolean existeEmail(String email) {
		// TODO Auto-generated method stub
		Utilisateurs Utilisateurs;
		Utilisateurs=em.find(Utilisateurs.class,email);
		if(Utilisateurs!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public void sauvegarderUtilisateur(Utilisateurs utilisateur) {
		// TODO Auto-generated method stub
		em.persist(utilisateur);
		
	}

	@Override
	public List<Etudiant> listerEtudiants() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select e from Etudiant e");
		return req.getResultList();
	}

	@Override
	public Etudiant chercherEtudiant(int id) {
		return em.find(Etudiant.class,id);
	}

	@Override
	public void ajouterEtudiant(Etudiant etud) {
		// TODO Auto-generated method stub
		em.persist(etud);
		
	}

	@Override
	public void activerCompte(String nom, String prenom) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("UPDATE Etudiant SET actif=true WHERE nom=:nom");
		 int update=  query.setParameter("nom",nom).executeUpdate();
		
	}

	@Override
	public void désactiverCompte(String nom, String prenom) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("UPDATE Etudiant SET actif=false WHERE nom=:nom");
		 int req=  query.setParameter("nom",nom).executeUpdate();
		
	}



}
