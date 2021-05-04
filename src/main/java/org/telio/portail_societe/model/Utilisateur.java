package org.telio.portail_societe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.telio.portail_societe.audit.Auditable;
import org.telio.portail_societe.idClass.UtilisateurID;

import javax.persistence.*;

@Table(name="Utilisateur")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UtilisateurID.class)
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur extends Auditable <String> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;
    @Column(name="nom", nullable = false)
    private String nom;
    @Column(name="prenom", nullable = false)
    private String prenom;
    @Column(name="login", nullable = false)
    private String login;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="statut", nullable = false)
    private String statut;
    private String tel;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "societe")
    private Societe societe;
    @ManyToOne(optional = false)
    @JoinColumnsOrFormulas(value = {
            @JoinColumnOrFormula(column = @JoinColumn(name="entite", referencedColumnName="id")),
            @JoinColumnOrFormula(formula = @JoinFormula(value = "societe", referencedColumnName = "societe"))
    })
    private Entite entite;
    @ManyToOne(optional = false)
    @JoinColumnsOrFormulas(value = {
            @JoinColumnOrFormula(column = @JoinColumn(name="profil", referencedColumnName="id")),
            @JoinColumnOrFormula(formula = @JoinFormula(value = "societe", referencedColumnName = "societe"))
    })
    private Profil profil;


    public Utilisateur(String nom, String prenom, String login, String password, String statut, String tel, Societe societe, Entite entite, Profil profil) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.statut = statut;
        this.tel = tel;
        this.societe = societe;
        this.entite = entite;
        this.profil = profil;
    }
}
