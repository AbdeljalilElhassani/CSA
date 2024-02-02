package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "structure_evaluation")
public class StructureEvaluation {
    @Id
    @Column(name = "NO_EVALUATION", nullable = false)
    private Double id;

    @NotNull
    @Column(name = "DATE_CREATION", nullable = false)
    private Instant dateCreation;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT", nullable = false, length = 3)
    private String etat;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Instant getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

}