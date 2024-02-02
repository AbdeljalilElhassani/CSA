package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "critere_entreprise")
public class CritereEntreprise {
    @Id
    @Column(name = "CRITE_ID", nullable = false)
    private Double id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_EVALUATION", nullable = false)
    private StructureEvaluation noEvaluation;

    @NotNull
    @Column(name = "ORDRE", nullable = false)
    private Double ordre;

    @Size(max = 200)
    @NotNull
    @Column(name = "DESIGNATION", nullable = false, length = 200)
    private String designation;

    @NotNull
    @Column(name = "POIDS", nullable = false)
    private Double poids;

    @Lob
    @Column(name = "DESCRIPTIF")
    private String descriptif;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public StructureEvaluation getNoEvaluation() {
        return noEvaluation;
    }

    public void setNoEvaluation(StructureEvaluation noEvaluation) {
        this.noEvaluation = noEvaluation;
    }

    public Double getOrdre() {
        return ordre;
    }

    public void setOrdre(Double ordre) {
        this.ordre = ordre;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

}