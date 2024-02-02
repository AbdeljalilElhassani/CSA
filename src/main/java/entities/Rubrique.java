package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "rubrique")
public class Rubrique {
    @Id
    @Column(name = "ID_RUBRIQUE", nullable = false)
    private Long id;

    @Size(max = 10)
    @NotNull
    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;

    @Size(max = 32)
    @NotNull
    @Column(name = "DESIGNATION", nullable = false, length = 32)
    private String designation;

    @Column(name = "ORDRE")
    private Double ordre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant noEnseignant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getOrdre() {
        return ordre;
    }

    public void setOrdre(Double ordre) {
        this.ordre = ordre;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

}