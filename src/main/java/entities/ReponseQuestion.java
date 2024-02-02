package entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "reponse_question")
public class ReponseQuestion {
    @EmbeddedId
    private ReponseQuestionId id;

    @MapsId("idReponseQuestion")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_REPONSE_QUESTION", nullable = false)
    private ReponseEvaluation idReponseQuestion;

    @MapsId("idQuestionEvaluation")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_QUESTION_EVALUATION", nullable = false)
    private QuestionEvaluation idQuestionEvaluation;

    @Column(name = "POSITIONNEMENT", precision = 38)
    private BigDecimal positionnement;

    public ReponseQuestionId getId() {
        return id;
    }

    public void setId(ReponseQuestionId id) {
        this.id = id;
    }

    public ReponseEvaluation getIdReponseQuestion() {
        return idReponseQuestion;
    }

    public void setIdReponseQuestion(ReponseEvaluation idReponseQuestion) {
        this.idReponseQuestion = idReponseQuestion;
    }

    public QuestionEvaluation getIdQuestionEvaluation() {
        return idQuestionEvaluation;
    }

    public void setIdQuestionEvaluation(QuestionEvaluation idQuestionEvaluation) {
        this.idQuestionEvaluation = idQuestionEvaluation;
    }

    public BigDecimal getPositionnement() {
        return positionnement;
    }

    public void setPositionnement(BigDecimal positionnement) {
        this.positionnement = positionnement;
    }

}