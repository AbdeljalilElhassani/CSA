package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DroitId implements Serializable {
    private static final long serialVersionUID = 131544534192875232L;
    @NotNull
    @Column(name = "ID_EVALUATION", nullable = false)
    private Long idEvaluation;

    @NotNull
    @Column(name = "NO_ENSEIGNANT", nullable = false)
    private Integer noEnseignant;

    public Long getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Long idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Integer getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Integer noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DroitId entity = (DroitId) o;
        return Objects.equals(this.idEvaluation, entity.idEvaluation) &&
                Objects.equals(this.noEnseignant, entity.noEnseignant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvaluation, noEnseignant);
    }

}