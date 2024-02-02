package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "candidat")
public class Candidat {
    @Id
    @Size(max = 50)
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String noEtudiantNat;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE_PRO", nullable = false)
    private Promotion anneePro;

    @NotNull
    @Column(name = "SEXE", nullable = false)
    private Character sexe;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @NotNull
    @Column(name = "DATE_NAISSANCE", nullable = false)
    private Instant dateNaissance;

    @Size(max = 255)
    @NotNull
    @Column(name = "LIEU_NAISSANCE", nullable = false)
    private String lieuNaissance;

    @Size(max = 3)
    @NotNull
    @Column(name = "SITUATION", nullable = false, length = 3)
    private String situation;

    @Size(max = 50)
    @NotNull
    @Column(name = "NATIONALITE", nullable = false, length = 50)
    private String nationalite;

    @Size(max = 20)
    @Column(name = "TEL_FIXE", length = 20)
    private String telFixe;

    @Size(max = 20)
    @Column(name = "TEL_PORT", length = 20)
    private String telPort;

    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;

    @Size(max = 255)
    @Column(name = "ACTU_ADRESSE")
    private String actuAdresse;

    @Size(max = 10)
    @Column(name = "ACTU_CP", length = 10)
    private String actuCp;

    @Size(max = 255)
    @Column(name = "ACTU_VILLE")
    private String actuVille;

    @Size(max = 255)
    @Column(name = "ACTU_PAYS")
    private String actuPays;

    @Size(max = 255)
    @NotNull
    @Column(name = "PERM_ADRESSE", nullable = false)
    private String permAdresse;

    @Size(max = 10)
    @NotNull
    @Column(name = "PERM_CP", nullable = false, length = 10)
    private String permCp;

    @Size(max = 255)
    @NotNull
    @Column(name = "PERM_VILLE", nullable = false)
    private String permVille;

    @Size(max = 255)
    @NotNull
    @Column(name = "PERM_PAYS", nullable = false)
    private String permPays;

    @Size(max = 255)
    @NotNull
    @Column(name = "DERNIER_DIPLOME", nullable = false)
    private String dernierDiplome;

    @Size(max = 255)
    @NotNull
    @Column(name = "UNIVERSITE", nullable = false)
    private String universite;

    @Size(max = 2)
    @NotNull
    @Column(name = "SELECTION_ORIGINE", nullable = false, length = 2)
    private String selectionOrigine;

    @Size(max = 2)
    @NotNull
    @Column(name = "SELECTION_COURANTE", nullable = false, length = 2)
    private String selectionCourante;

    @NotNull
    @Column(name = "REPONSE_ILI", nullable = false)
    private Character reponseIli;

    @Column(name = "DATE_REPONSE_ILI")
    private Instant dateReponseIli;

    @Size(max = 3)
    @Column(name = "REPONSE_CAN", length = 3)
    private String reponseCan;

    @Column(name = "DATE_REPONSE_CAN")
    private Instant dateReponseCan;

    @Column(name = "NO_ORDRE")
    private Double noOrdre;

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Promotion getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(Promotion anneePro) {
        this.anneePro = anneePro;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Instant getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Instant dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActuAdresse() {
        return actuAdresse;
    }

    public void setActuAdresse(String actuAdresse) {
        this.actuAdresse = actuAdresse;
    }

    public String getActuCp() {
        return actuCp;
    }

    public void setActuCp(String actuCp) {
        this.actuCp = actuCp;
    }

    public String getActuVille() {
        return actuVille;
    }

    public void setActuVille(String actuVille) {
        this.actuVille = actuVille;
    }

    public String getActuPays() {
        return actuPays;
    }

    public void setActuPays(String actuPays) {
        this.actuPays = actuPays;
    }

    public String getPermAdresse() {
        return permAdresse;
    }

    public void setPermAdresse(String permAdresse) {
        this.permAdresse = permAdresse;
    }

    public String getPermCp() {
        return permCp;
    }

    public void setPermCp(String permCp) {
        this.permCp = permCp;
    }

    public String getPermVille() {
        return permVille;
    }

    public void setPermVille(String permVille) {
        this.permVille = permVille;
    }

    public String getPermPays() {
        return permPays;
    }

    public void setPermPays(String permPays) {
        this.permPays = permPays;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSelectionOrigine() {
        return selectionOrigine;
    }

    public void setSelectionOrigine(String selectionOrigine) {
        this.selectionOrigine = selectionOrigine;
    }

    public String getSelectionCourante() {
        return selectionCourante;
    }

    public void setSelectionCourante(String selectionCourante) {
        this.selectionCourante = selectionCourante;
    }

    public Character getReponseIli() {
        return reponseIli;
    }

    public void setReponseIli(Character reponseIli) {
        this.reponseIli = reponseIli;
    }

    public Instant getDateReponseIli() {
        return dateReponseIli;
    }

    public void setDateReponseIli(Instant dateReponseIli) {
        this.dateReponseIli = dateReponseIli;
    }

    public String getReponseCan() {
        return reponseCan;
    }

    public void setReponseCan(String reponseCan) {
        this.reponseCan = reponseCan;
    }

    public Instant getDateReponseCan() {
        return dateReponseCan;
    }

    public void setDateReponseCan(Instant dateReponseCan) {
        this.dateReponseCan = dateReponseCan;
    }

    public Double getNoOrdre() {
        return noOrdre;
    }

    public void setNoOrdre(Double noOrdre) {
        this.noOrdre = noOrdre;
    }

}