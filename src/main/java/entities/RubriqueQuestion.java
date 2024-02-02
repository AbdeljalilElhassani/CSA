package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "rubrique_question")
public class RubriqueQuestion {
    @EmbeddedId
    private RubriqueQuestionId id;

    @MapsId("idRubrique")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_RUBRIQUE", nullable = false)
    private Rubrique idRubrique;

    @MapsId("idQuestion")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_QUESTION", nullable = false)
    private Question idQuestion;

    @NotNull
    @Column(name = "ORDRE", nullable = false, precision = 38)
    private BigDecimal ordre;

    public RubriqueQuestionId getId() {
        return id;
    }

    public void setId(RubriqueQuestionId id) {
        this.id = id;
    }

    public Rubrique getIdRubrique() {
        return idRubrique;
    }

    public void setIdRubrique(Rubrique idRubrique) {
        this.idRubrique = idRubrique;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }

    public BigDecimal getOrdre() {
        return ordre;
    }

    public void setOrdre(BigDecimal ordre) {
        this.ordre = ordre;
    }

}