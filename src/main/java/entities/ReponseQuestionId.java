package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReponseQuestionId implements Serializable {
    private static final long serialVersionUID = 8815570641691444120L;
    @NotNull
    @Column(name = "ID_REPONSE_QUESTION", nullable = false)
    private Long idReponseQuestion;

    @NotNull
    @Column(name = "ID_QUESTION_EVALUATION", nullable = false)
    private Long idQuestionEvaluation;

    public Long getIdReponseQuestion() {
        return idReponseQuestion;
    }

    public void setIdReponseQuestion(Long idReponseQuestion) {
        this.idReponseQuestion = idReponseQuestion;
    }

    public Long getIdQuestionEvaluation() {
        return idQuestionEvaluation;
    }

    public void setIdQuestionEvaluation(Long idQuestionEvaluation) {
        this.idQuestionEvaluation = idQuestionEvaluation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReponseQuestionId entity = (ReponseQuestionId) o;
        return Objects.equals(this.idQuestionEvaluation, entity.idQuestionEvaluation) &&
                Objects.equals(this.idReponseQuestion, entity.idReponseQuestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestionEvaluation, idReponseQuestion);
    }

}