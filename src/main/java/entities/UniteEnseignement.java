package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "unite_enseignement")
public class UniteEnseignement {
    @Id
    @Column(name = "ueid", nullable = false)
    private Integer ueid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_FORMATION", nullable = false)
    private Formation codeFormation;

    @Size(max = 8)
    @NotNull
    @Column(name = "CODE_UE", nullable = false, length = 8)
    private String codeUe;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENSEIGNANT", nullable = false)
    private Enseignant noEnseignant;

    @Size(max = 64)
    @NotNull
    @Column(name = "DESIGNATION", nullable = false, length = 64)
    private String designation;

    @Size(max = 3)
    @NotNull
    @Column(name = "SEMESTRE", nullable = false, length = 3)
    private String semestre;

    @Size(max = 256)
    @Column(name = "DESCRIPTION", length = 256)
    private String description;

    @Column(name = "NBH_CM", precision = 38)
    private BigDecimal nbhCm;

    @Column(name = "NBH_TD")
    private Byte nbhTd;

    @Column(name = "NBH_TP")
    private Byte nbhTp;

    public Integer getId() {
        return ueid;
    }

    public void setId(Integer id) {
        this.ueid = id;
    }

    public Formation getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(Formation codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getNbhCm() {
        return nbhCm;
    }

    public void setNbhCm(BigDecimal nbhCm) {
        this.nbhCm = nbhCm;
    }

    public Byte getNbhTd() {
        return nbhTd;
    }

    public void setNbhTd(Byte nbhTd) {
        this.nbhTd = nbhTd;
    }

    public Byte getNbhTp() {
        return nbhTp;
    }

    public void setNbhTp(Byte nbhTp) {
        this.nbhTp = nbhTp;
    }

}