package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "promotion")
public class Promotion {
    @Id
    @Size(max = 10)
    @Column(name = "ANNEE_PRO", nullable = false, length = 10)
    private String anneePro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_FORMATION")
    private Formation codeFormation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant noEnseignant;

    @Size(max = 5)
    @NotNull
    @Column(name = "SIGLE_PRO", nullable = false, length = 5)
    private String siglePro;

    @NotNull
    @Column(name = "NB_ETU_SOUHAITE", nullable = false)
    private Short nbEtuSouhaite;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT_PRESELECTION", nullable = false, length = 3)
    private String etatPreselection;

    @Column(name = "DATE_RENTREE")
    private Instant dateRentree;

    @Size(max = 255)
    @Column(name = "LIEU_RENTREE")
    private String lieuRentree;

    @Column(name = "DATE_REPONSE_LP")
    private Instant dateReponseLp;

    @Size(max = 255)
    @Column(name = "COMMENTAIRE")
    private String commentaire;

    @Column(name = "DATE_REPONSE_LALP")
    private Instant dateReponseLalp;

    @Size(max = 5)
    @Column(name = "PROCESSUS_STAGE", length = 5)
    private String processusStage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_EVALUATION")
    private StructureEvaluation noEvaluation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_BAREME")
    private NotationStage noBareme;

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public Formation getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(Formation codeFormation) {
        this.codeFormation = codeFormation;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getSiglePro() {
        return siglePro;
    }

    public void setSiglePro(String siglePro) {
        this.siglePro = siglePro;
    }

    public Short getNbEtuSouhaite() {
        return nbEtuSouhaite;
    }

    public void setNbEtuSouhaite(Short nbEtuSouhaite) {
        this.nbEtuSouhaite = nbEtuSouhaite;
    }

    public String getEtatPreselection() {
        return etatPreselection;
    }

    public void setEtatPreselection(String etatPreselection) {
        this.etatPreselection = etatPreselection;
    }

    public Instant getDateRentree() {
        return dateRentree;
    }

    public void setDateRentree(Instant dateRentree) {
        this.dateRentree = dateRentree;
    }

    public String getLieuRentree() {
        return lieuRentree;
    }

    public void setLieuRentree(String lieuRentree) {
        this.lieuRentree = lieuRentree;
    }

    public Instant getDateReponseLp() {
        return dateReponseLp;
    }

    public void setDateReponseLp(Instant dateReponseLp) {
        this.dateReponseLp = dateReponseLp;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Instant getDateReponseLalp() {
        return dateReponseLalp;
    }

    public void setDateReponseLalp(Instant dateReponseLalp) {
        this.dateReponseLalp = dateReponseLalp;
    }

    public String getProcessusStage() {
        return processusStage;
    }

    public void setProcessusStage(String processusStage) {
        this.processusStage = processusStage;
    }

    public StructureEvaluation getNoEvaluation() {
        return noEvaluation;
    }

    public void setNoEvaluation(StructureEvaluation noEvaluation) {
        this.noEvaluation = noEvaluation;
    }

    public NotationStage getNoBareme() {
        return noBareme;
    }

    public void setNoBareme(NotationStage noBareme) {
        this.noBareme = noBareme;
    }

}