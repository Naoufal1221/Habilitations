package org.telio.portail_societe.dto.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.telio.portail_societe.audit.Auditable;
import org.telio.portail_societe.model.Societe;

import javax.persistence.EntityListeners;

@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class TypeEntiteDTO extends Auditable<String> {

    private Long id;
    private String nom;
    private String code;
    private TypeEntiteDTO typeEntiteMereDTO;
    private SocieteDTO societe;

    public TypeEntiteDTO(String nom, String code, TypeEntiteDTO typeEntiteMereDTO, SocieteDTO societe) {
        this.nom = nom;
        this.code = code;
        this.typeEntiteMereDTO = typeEntiteMereDTO;
        this.societe = societe;
    }
    public String toUpperNom()
    {
        return this.nom.toUpperCase();
    }

    public String toUpperCode()
    {
        return this.nom.toUpperCase();
    }
}
