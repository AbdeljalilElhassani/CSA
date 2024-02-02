package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "question_evaluation")
public class QuestionEvaluation {
    @Id
    @Column(name = "ID_QUESTION_EVALUATION", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_RUBRIQUE_EVALUATION", nullable = false)
    private RubriqueEvaluation idRubriqueEvaluation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_QUESTION")
    private Question idQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_QUALIFICATIF")
    private Qualificatif idQualificatif;

    @NotNull
    @Column(name = "ORDRE", nullable = false)
    private Byte ordre;

    @Size(max = 64)
    @Column(name = "INTITULE", length = 64)
    private String intitule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RubriqueEvaluation getIdRubriqueEvaluation() {
        return idRubriqueEvaluation;
    }

    public void setIdRubriqueEvaluation(RubriqueEvaluation idRubriqueEvaluation) {
        this.idRubriqueEvaluation = idRubriqueEvaluation;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Qualificatif getIdQualificatif() {
        return idQualificatif;
    }

    public void setIdQualificatif(Qualificatif idQualificatif) {
        this.idQualificatif = idQualificatif;
    }

    public Byte getOrdre() {
        return ordre;
    }

    public void setOrdre(Byte ordre) {
        this.ordre = ordre;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

}