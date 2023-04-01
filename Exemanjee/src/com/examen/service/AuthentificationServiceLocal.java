package com.examen.service;

import java.util.List;

import com.examen.entities.Etudiant;
import com.examen.entities.Reclamation;
import com.examen.entities.TypeReclamation;
import com.examen.entities.Utilisateurs;

import jakarta.ejb.Local;

@Local
public interface AuthentificationServiceLocal {
	public Utilisateurs authentifier(String email, String pwd);
	boolean existeEmail(String email);
	void sauvegarderUtilisateur(Utilisateurs utilisateur);
	List<Etudiant> listerEtudiants();
	public Etudiant chercherEtudiant(int id);
	public void ajouterEtudiant(Etudiant etud);
	public void activerCompte(String nom, String prenom);
	public void désactiverCompte(String nom, String prenom);

}
