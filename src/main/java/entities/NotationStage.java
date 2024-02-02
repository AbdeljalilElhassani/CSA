package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "notation_stage")
public class NotationStage {
    @Id
    @Column(name = "NO_BAREME", nullable = false)
    private Double id;

    @NotNull
    @Column(name = "COEFF_ENT", nullable = false)
    private Double coeffEnt;

    @NotNull
    @Column(name = "COEFF_RAPPORT", nullable = false)
    private Double coeffRapport;

    @NotNull
    @Column(name = "COEFF_SOUTENANCE", nullable = false)
    private Double coeffSoutenance;

    @NotNull
    @Column(name = "DATE_CREATION", nullable = false)
    private Instant dateCreation;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT_BAREME", nullable = false, length = 3)
    private String etatBareme;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getCoeffEnt() {
        return coeffEnt;
    }

    public void setCoeffEnt(Double coeffEnt) {
        this.coeffEnt = coeffEnt;
    }

    public Double getCoeffRapport() {
        return coeffRapport;
    }

    public void setCoeffRapport(Double coeffRapport) {
        this.coeffRapport = coeffRapport;
    }

    public Double getCoeffSoutenance() {
        return coeffSoutenance;
    }

    public void setCoeffSoutenance(Double coeffSoutenance) {
        this.coeffSoutenance = coeffSoutenance;
    }

    public Instant getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getEtatBareme() {
        return etatBareme;
    }

    public void setEtatBareme(String etatBareme) {
        this.etatBareme = etatBareme;
    }

}