package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "element_constitutif")
public class ElementConstitutif {
    @EmbeddedId
    private ElementConstitutifId ecId;

    //@MapsId("ecId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UniteEnseignement uniteEnseignement;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENSEIGNANT", nullable = false)
    private Enseignant noEnseignant;

    @Size(max = 64)
    @NotNull
    @Column(name = "DESIGNATION", nullable = false, length = 64)
    private String designation;

    @Size(max = 240)
    @NotNull
    @Column(name = "DESCRIPTION", nullable = false, length = 240)
    private String description;

    @Column(name = "NBH_CM")
    private Byte nbhCm;

    @Column(name = "NBH_TD")
    private Byte nbhTd;

    @Column(name = "NBH_TP")
    private Byte nbhTp;

    public ElementConstitutifId getId() {
        return ecId;
    }

    public void setId(ElementConstitutifId id) {
        this.ecId = id;
    }

    public UniteEnseignement getUniteEnseignement() {
        return uniteEnseignement;
    }

    public void setUniteEnseignement(UniteEnseignement uniteEnseignement) {
        this.uniteEnseignement = uniteEnseignement;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getNbhCm() {
        return nbhCm;
    }

    public void setNbhCm(Byte nbhCm) {
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