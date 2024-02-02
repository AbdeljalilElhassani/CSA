package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "ID_QUESTION", nullable = false)
    private Long id;

    @Size(max = 10)
    @NotNull
    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant noEnseignant;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_QUALIFICATIF", nullable = false)
    private Qualificatif idQualificatif;

    @Size(max = 64)
    @NotNull
    @Column(name = "`INTITULֹ`", nullable = false, length = 64)
    private String intitulֹ;

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

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public Qualificatif getIdQualificatif() {
        return idQualificatif;
    }

    public void setIdQualificatif(Qualificatif idQualificatif) {
        this.idQualificatif = idQualificatif;
    }

    public String getIntitulֹ() {
        return intitulֹ;
    }

    public void setIntitulֹ(String intitulֹ) {
        this.intitulֹ = intitulֹ;
    }

}