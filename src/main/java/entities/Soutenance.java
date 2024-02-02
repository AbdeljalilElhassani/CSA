package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "soutenance")
public class Soutenance {
    @EmbeddedId
    private SoutenanceId id;

    @MapsId("anneePro")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE_PRO", nullable = false)
    private Promotion anneePro;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENSEIGNANT_RESPONSABLE", nullable = false)
    private Enseignant noEnseignantResponsable;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENSEIGNANT_ASSESSEUR", nullable = false)
    private Enseignant noEnseignantAssesseur;

    @NotNull
    @Column(name = "DATE_SOUTENANCE", nullable = false)
    private Instant dateSoutenance;

    @Size(max = 50)
    @NotNull
    @Column(name = "PLAGE_HORAIRE", nullable = false, length = 50)
    private String plageHoraire;

    @Size(max = 12)
    @NotNull
    @Column(name = "SALLE", nullable = false, length = 12)
    private String salle;

    public SoutenanceId getId() {
        return id;
    }

    public void setId(SoutenanceId id) {
        this.id = id;
    }

    public Promotion getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(Promotion anneePro) {
        this.anneePro = anneePro;
    }

    public Enseignant getNoEnseignantResponsable() {
        return noEnseignantResponsable;
    }

    public void setNoEnseignantResponsable(Enseignant noEnseignantResponsable) {
        this.noEnseignantResponsable = noEnseignantResponsable;
    }

    public Enseignant getNoEnseignantAssesseur() {
        return noEnseignantAssesseur;
    }

    public void setNoEnseignantAssesseur(Enseignant noEnseignantAssesseur) {
        this.noEnseignantAssesseur = noEnseignantAssesseur;
    }

    public Instant getDateSoutenance() {
        return dateSoutenance;
    }

    public void setDateSoutenance(Instant dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public String getPlageHoraire() {
        return plageHoraire;
    }

    public void setPlageHoraire(String plageHoraire) {
        this.plageHoraire = plageHoraire;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

}