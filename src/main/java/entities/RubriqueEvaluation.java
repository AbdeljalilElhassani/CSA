package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "rubrique_evaluation")
public class RubriqueEvaluation {
    @Id
    @Column(name = "ID_RUBRIQUE_EVALUATION", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_EVALUATION", nullable = false)
    private Evaluation idEvaluation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RUBRIQUE")
    private Rubrique idRubrique;

    @NotNull
    @Column(name = "ORDRE", nullable = false)
    private Byte ordre;

    @Size(max = 64)
    @Column(name = "DESIGNATION", length = 64)
    private String designation;

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

    public Rubrique getIdRubrique() {
        return idRubrique;
    }

    public void setIdRubrique(Rubrique idRubrique) {
        this.idRubrique = idRubrique;
    }

    public Byte getOrdre() {
        return ordre;
    }

    public void setOrdre(Byte ordre) {
        this.ordre = ordre;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}