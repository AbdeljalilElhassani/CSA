package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "note_entreprise")
public class NoteEntreprise {
    @EmbeddedId
    private NoteEntrepriseId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "NO_ETUDIANT_NAT", referencedColumnName = "NO_ETUDIANT_NAT", nullable = false),
            @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "ANNEE_PRO", nullable = false)
    })
    private EvaluationEntreprise evaluationEntreprise;

    @MapsId("criteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CRITE_ID", nullable = false)
    private CritereEntreprise crite;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODN_ID", nullable = false)
    private CodeNotation codn;

    @Lob
    @Column(name = "COMMENTAIRE")
    private String commentaire;

    public NoteEntrepriseId getId() {
        return id;
    }

    public void setId(NoteEntrepriseId id) {
        this.id = id;
    }

    public EvaluationEntreprise getEvaluationEntreprise() {
        return evaluationEntreprise;
    }

    public void setEvaluationEntreprise(EvaluationEntreprise evaluationEntreprise) {
        this.evaluationEntreprise = evaluationEntreprise;
    }

    public CritereEntreprise getCrite() {
        return crite;
    }

    public void setCrite(CritereEntreprise crite) {
        this.crite = crite;
    }

    public CodeNotation getCodn() {
        return codn;
    }

    public void setCodn(CodeNotation codn) {
        this.codn = codn;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}