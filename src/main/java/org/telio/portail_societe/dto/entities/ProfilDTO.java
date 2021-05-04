package org.telio.portail_societe.dto.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.telio.portail_societe.audit.Auditable;

import javax.persistence.EntityListeners;

@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ProfilDTO extends Auditable <String> {

    private Long id;
    private String nom;
    private SocieteDTO societe;


    public ProfilDTO(String nom, SocieteDTO societe) {
        this.nom = nom;
        this.societe = societe;
    }

    public String toUpperNom()
    {
        return this.nom.toUpperCase();
    }


}
