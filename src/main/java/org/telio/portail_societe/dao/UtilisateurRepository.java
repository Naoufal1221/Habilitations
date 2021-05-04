package org.telio.portail_societe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.telio.portail_societe.idClass.UtilisateurID;
import org.telio.portail_societe.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository <Utilisateur, UtilisateurID> {
}
