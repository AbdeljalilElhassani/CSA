package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "offre_stage")
public class OffreStage {
    @Id
    @Column(name = "NO_OFFRE", nullable = false)
    private Double id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENTREPRISE", nullable = false)
    private Entreprise noEntreprise;

    @Size(max = 20)
    @Column(name = "NO_OFFRE_ENTREPRISE", length = 20)
    private String noOffreEntreprise;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE_PRO", nullable = false)
    private Promotion anneePro;

    @Size(max = 100)
    @NotNull
    @Column(name = "INTITULE", nullable = false, length = 100)
    private String intitule;

    @Size(max = 255)
    @NotNull
    @Column(name = "SUJET", nullable = false)
    private String sujet;

    @NotNull
    @Column(name = "DATE_CREATION", nullable = false)
    private Instant dateCreation;

    @Size(max = 4000)
    @Column(name = "DESCRIPTION", length = 4000)
    private String description;

    @Size(max = 30)
    @NotNull
    @Column(name = "DUREE", nullable = false, length = 30)
    private String duree;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT_OFFRE", nullable = false, length = 3)
    private String etatOffre;

    @Size(max = 80)
    @NotNull
    @Column(name = "LIEU", nullable = false, length = 80)
    private String lieu;

    @Size(max = 5)
    @NotNull
    @Column(name = "NIVEAU_REQUIS", nullable = false, length = 5)
    private String niveauRequis;

    @Size(max = 50)
    @NotNull
    @Column(name = "PERIODE", nullable = false, length = 50)
    private String periode;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOM_RESPONSABLE", nullable = false, length = 50)
    private String nomResponsable;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRENOM_RESPONSABLE", nullable = false, length = 50)
    private String prenomResponsable;

    @Size(max = 20)
    @Column(name = "TEL_RESPONSABLE", length = 20)
    private String telResponsable;

    @Size(max = 100)
    @Column(name = "MAIL_RESPONSABLE", length = 100)
    private String mailResponsable;

    @Size(max = 20)
    @Column(name = "REMUNERATION", length = 20)
    private String remuneration;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Entreprise getNoEntreprise() {
        return noEntreprise;
    }

    public void setNoEntreprise(Entreprise noEntreprise) {
        this.noEntreprise = noEntreprise;
    }

    public String getNoOffreEntreprise() {
        return noOffreEntreprise;
    }

    public void setNoOffreEntreprise(String noOffreEntreprise) {
        this.noOffreEntreprise = noOffreEntreprise;
    }

    public Promotion getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(Promotion anneePro) {
        this.anneePro = anneePro;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Instant getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getEtatOffre() {
        return etatOffre;
    }

    public void setEtatOffre(String etatOffre) {
        this.etatOffre = etatOffre;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNiveauRequis() {
        return niveauRequis;
    }

    public void setNiveauRequis(String niveauRequis) {
        this.niveauRequis = niveauRequis;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    public String getPrenomResponsable() {
        return prenomResponsable;
    }

    public void setPrenomResponsable(String prenomResponsable) {
        this.prenomResponsable = prenomResponsable;
    }

    public String getTelResponsable() {
        return telResponsable;
    }

    public void setTelResponsable(String telResponsable) {
        this.telResponsable = telResponsable;
    }

    public String getMailResponsable() {
        return mailResponsable;
    }

    public void setMailResponsable(String mailResponsable) {
        this.mailResponsable = mailResponsable;
    }

    public String getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(String remuneration) {
        this.remuneration = remuneration;
    }

}