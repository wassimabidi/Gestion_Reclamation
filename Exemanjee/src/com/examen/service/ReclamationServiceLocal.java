package com.examen.service;

import java.util.List;

import com.examen.entities.Etudiant;
import com.examen.entities.Reclamation;
import com.examen.entities.TypeReclamation;
import com.examen.entities.Utilisateurs;

import jakarta.ejb.Local;
@Local
public interface ReclamationServiceLocal {

	public void ajouterReclamation(Reclamation reclamation);
	public void ajouterTypeReclamation(TypeReclamation typeReclamation);
	public List<Reclamation> listerReclamations();
	public List<TypeReclamation> listerTypeReclamations();
	public boolean existeTypeReclalamtion(String type);
	public TypeReclamation chercherTypeReclamationParType(String type);
	public List<Reclamation> listerReclamationParEtudiant(Etudiant etudiant);
	public Reclamation chercherReclamation(Integer id_reclamation);
	public TypeReclamation chercherTypeReclamationParid(int id_type);
}   
