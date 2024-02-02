package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "reponse_evaluation")
public class ReponseEvaluation {
    @Id
    @Column(name = "ID_REPONSE_EVALUATION", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_EVALUATION", nullable = false)
    private Evaluation idEvaluation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_ETUDIANT_NAT")
    private Etudiant noEtudiantNat;

    @Size(max = 512)
    @Column(name = "COMMENTAIRE", length = 512)
    private String commentaire;

    @Size(max = 32)
    @Column(name = "NOM", length = 32)
    private String nom;

    @Size(max = 32)
    @Column(name = "PRENOM", length = 32)
    private String prenom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evaluation getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Evaluation idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Etudiant getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(Etudiant noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}