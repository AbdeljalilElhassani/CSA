package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "formation")
public class Formation {
    @Id
    @Size(max = 8)
    @Column(name = "CODE_FORMATION", nullable = false, length = 8)
    private String codeFormation;

    @Size(max = 3)
    @NotNull
    @Column(name = "DIPLOME", nullable = false, length = 3)
    private String diplome;

    @NotNull
    @Column(name = "N0_ANNEE", nullable = false)
    private Byte n0Annee;

    @Size(max = 64)
    @NotNull
    @Column(name = "NOM_FORMATION", nullable = false, length = 64)
    private String nomFormation;

    @NotNull
    @Column(name = "DOUBLE_DIPLOME", nullable = false)
    private Character doubleDiplome;

    @Column(name = "DEBUT_HABILITATION")
    private Instant debutHabilitation;

    @Column(name = "FIN_HABILITATION")
    private Instant finHabilitation;

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public Byte getN0Annee() {
        return n0Annee;
    }

    public void setN0Annee(Byte n0Annee) {
        this.n0Annee = n0Annee;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public Character getDoubleDiplome() {
        return doubleDiplome;
    }

    public void setDoubleDiplome(Character doubleDiplome) {
        this.doubleDiplome = doubleDiplome;
    }

    public Instant getDebutHabilitation() {
        return debutHabilitation;
    }

    public void setDebutHabilitation(Instant debutHabilitation) {
        this.debutHabilitation = debutHabilitation;
    }

    public Instant getFinHabilitation() {
        return finHabilitation;
    }

    public void setFinHabilitation(Instant finHabilitation) {
        this.finHabilitation = finHabilitation;
    }

}