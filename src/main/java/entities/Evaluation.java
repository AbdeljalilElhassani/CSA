package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @Column(name = "ID_EVALUATION", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENSEIGNANT", nullable = false)
    private Enseignant noEnseignant;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "CODE_FORMATION", referencedColumnName = "CODE_FORMATION", nullable = false),
            @JoinColumn(name = "CODE_UE", referencedColumnName = "CODE_UE", nullable = false),
            @JoinColumn(name = "CODE_EC", referencedColumnName = "CODE_EC", nullable = false)
    })
    private ElementConstitutif elementConstitutif;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE_PRO", nullable = false)
    private Promotion anneePro;

    @NotNull
    @Column(name = "NO_EVALUATION", nullable = false)
    private Byte noEvaluation;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT", nullable = false, length = 3)
    private String etat;

    @Size(max = 64)
    @Column(name = "PERIODE", length = 64)
    private String periode;

    @NotNull
    @Column(name = "DEBUT_REPONSE", nullable = false)
    private Instant debutReponse;

    @NotNull
    @Column(name = "FIN_REPONSE", nullable = false)
    private Instant finReponse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public ElementConstitutif getElementConstitutif() {
        return elementConstitutif;
    }

    public void setElementConstitutif(ElementConstitutif elementConstitutif) {
        this.elementConstitutif = elementConstitutif;
    }

    public Promotion getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(Promotion anneePro) {
        this.anneePro = anneePro;
    }

    public Byte getNoEvaluation() {
        return noEvaluation;
    }

    public void setNoEvaluation(Byte noEvaluation) {
        this.noEvaluation = noEvaluation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public Instant getDebutReponse() {
        return debutReponse;
    }

    public void setDebutReponse(Instant debutReponse) {
        this.debutReponse = debutReponse;
    }

    public Instant getFinReponse() {
        return finReponse;
    }

    public void setFinReponse(Instant finReponse) {
        this.finReponse = finReponse;
    }

}