package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "stage")
public class Stage {
    @EmbeddedId
    private StageId id;

    @MapsId("anneePro")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE_PRO", nullable = false)
    private Promotion anneePro;

    @MapsId("noEtudiantNat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ETUDIANT_NAT", nullable = false)
    private Etudiant noEtudiantNat;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENTREPRISE", nullable = false)
    private Entreprise noEntreprise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_OFFRE")
    private OffreStage noOffre;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_CONTACT_ILI", nullable = false)
    private Employe noContactIli;

    @Size(max = 200)
    @NotNull
    @Column(name = "INTITULE", nullable = false, length = 200)
    private String intitule;

    @Size(max = 200)
    @NotNull
    @Column(name = "SUJET", nullable = false, length = 200)
    private String sujet;

    @NotNull
    @Column(name = "DATE_DEB", nullable = false)
    private Instant dateDeb;

    @NotNull
    @Column(name = "DATE_FIN", nullable = false)
    private Instant dateFin;

    @Size(max = 50)
    @NotNull
    @Column(name = "LIEU", nullable = false, length = 50)
    private String lieu;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT_STAGE", nullable = false, length = 3)
    private String etatStage;

    @Size(max = 4000)
    @Column(name = "DESCRIPTION", length = 4000)
    private String description;

    @Size(max = 3)
    @Column(name = "ETAT_CONVENTION", length = 3)
    private String etatConvention;

    @Column(name = "DATE_SIGNATURE_CONV")
    private Instant dateSignatureConv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant noEnseignant;

    @Size(max = 255)
    @Column(name = "COMMENTAIRE_TUTEUR")
    private String commentaireTuteur;

    @Column(name = "DATE_RECEPTION_RAPPORT")
    private Instant dateReceptionRapport;

    @Column(name = "NOTE_ENTREPRISE")
    private Double noteEntreprise;

    @Column(name = "NOTE_RAPPORT")
    private Double noteRapport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "ANNEE_PRO"),
            @JoinColumn(name = "NO_SESSION", referencedColumnName = "NO_SESSION")
    })
    private Soutenance soutenance;


    @Column(name = "NOTE_SOUTENANCE")
    private Double noteSoutenance;

    public StageId getId() {
        return id;
    }

    public void setId(StageId id) {
        this.id = id;
    }

    public Promotion getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(Promotion anneePro) {
        this.anneePro = anneePro;
    }

    public Etudiant getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(Etudiant noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Entreprise getNoEntreprise() {
        return noEntreprise;
    }

    public void setNoEntreprise(Entreprise noEntreprise) {
        this.noEntreprise = noEntreprise;
    }

    public OffreStage getNoOffre() {
        return noOffre;
    }

    public void setNoOffre(OffreStage noOffre) {
        this.noOffre = noOffre;
    }

    public Employe getNoContactIli() {
        return noContactIli;
    }

    public void setNoContactIli(Employe noContactIli) {
        this.noContactIli = noContactIli;
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

    public Instant getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Instant dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Instant getDateFin() {
        return dateFin;
    }

    public void setDateFin(Instant dateFin) {
        this.dateFin = dateFin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getEtatStage() {
        return etatStage;
    }

    public void setEtatStage(String etatStage) {
        this.etatStage = etatStage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtatConvention() {
        return etatConvention;
    }

    public void setEtatConvention(String etatConvention) {
        this.etatConvention = etatConvention;
    }

    public Instant getDateSignatureConv() {
        return dateSignatureConv;
    }

    public void setDateSignatureConv(Instant dateSignatureConv) {
        this.dateSignatureConv = dateSignatureConv;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getCommentaireTuteur() {
        return commentaireTuteur;
    }

    public void setCommentaireTuteur(String commentaireTuteur) {
        this.commentaireTuteur = commentaireTuteur;
    }

    public Instant getDateReceptionRapport() {
        return dateReceptionRapport;
    }

    public void setDateReceptionRapport(Instant dateReceptionRapport) {
        this.dateReceptionRapport = dateReceptionRapport;
    }

    public Double getNoteEntreprise() {
        return noteEntreprise;
    }

    public void setNoteEntreprise(Double noteEntreprise) {
        this.noteEntreprise = noteEntreprise;
    }

    public Double getNoteRapport() {
        return noteRapport;
    }

    public void setNoteRapport(Double noteRapport) {
        this.noteRapport = noteRapport;
    }

    public Soutenance getSoutenance() {
        return soutenance;
    }

    public void setSoutenance(Soutenance soutenance) {
        this.soutenance = soutenance;
    }

    public Double getNoteSoutenance() {
        return noteSoutenance;
    }

    public void setNoteSoutenance(Double noteSoutenance) {
        this.noteSoutenance = noteSoutenance;
    }

}