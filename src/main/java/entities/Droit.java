package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "droit")
public class Droit {
    @EmbeddedId
    private DroitId id;

    @MapsId("idEvaluation")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_EVALUATION", nullable = false)
    private Evaluation idEvaluation;

    @MapsId("noEnseignant")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENSEIGNANT", nullable = false)
    private Enseignant noEnseignant;

    @NotNull
    @Column(name = "CONSULTATION", nullable = false)
    private Character consultation;

    @NotNull
    @Column(name = "DUPLICATION", nullable = false)
    private Character duplication;

    public DroitId getId() {
        return id;
    }

    public void setId(DroitId id) {
        this.id = id;
    }

    public Evaluation getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Evaluation idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public Character getConsultation() {
        return consultation;
    }

    public void setConsultation(Character consultation) {
        this.consultation = consultation;
    }

    public Character getDuplication() {
        return duplication;
    }

    public void setDuplication(Character duplication) {
        this.duplication = duplication;
    }

}