package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "enseignant")
public class Enseignant {
    @Id
    @Column(name = "NO_ENSEIGNANT", nullable = false)
    private Integer id;

    @Size(max = 10)
    @NotNull
    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;

    @Size(max = 1)
    @NotNull
    @Column(name = "SEXE", nullable = false, length = 1)
    private String sexe;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @Size(max = 255)
    @NotNull
    @Column(name = "ADRESSE", nullable = false)
    private String adresse;

    @Size(max = 10)
    @NotNull
    @Column(name = "CP", nullable = false, length = 10)
    private String cp;

    @Size(max = 255)
    @NotNull
    @Column(name = "VILLE", nullable = false)
    private String ville;

    @Size(max = 255)
    @NotNull
    @Column(name = "PAYS", nullable = false)
    private String pays;

    @Size(max = 20)
    @Column(name = "TEL_PORT", length = 20)
    private String telPort;

    @Size(max = 20)
    @Column(name = "ENC_PERSO_TEL", length = 20)
    private String encPersoTel;

    @Size(max = 20)
    @Column(name = "ENC_UBO_TEL", length = 20)
    private String encUboTel;

    @Size(max = 255)
    @Column(name = "ENC_PERSO_EMAIL")
    private String encPersoEmail;

    @Size(max = 255)
    @Column(name = "ENC_UBO_EMAIL")
    private String encUboEmail;

    @Size(max = 50)
    @Column(name = "INT_NO_INSEE", length = 50)
    private String intNoInsee;

    @Size(max = 50)
    @Column(name = "INT_SOC_NOM", length = 50)
    private String intSocNom;

    @Size(max = 255)
    @Column(name = "INT_SOC_ADRESSE")
    private String intSocAdresse;

    @Size(max = 10)
    @Column(name = "INT_SOC_CP", length = 10)
    private String intSocCp;

    @Size(max = 255)
    @Column(name = "INT_SOC_VILLE")
    private String intSocVille;

    @Size(max = 255)
    @Column(name = "INT_SOC_PAYS")
    private String intSocPays;

    @Size(max = 50)
    @Column(name = "INT_FONCTION", length = 50)
    private String intFonction;

    @Size(max = 255)
    @Column(name = "INT_PROF_EMAIL")
    private String intProfEmail;

    @Size(max = 20)
    @Column(name = "INT_PROF_TEL", length = 20)
    private String intProfTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getEncPersoTel() {
        return encPersoTel;
    }

    public void setEncPersoTel(String encPersoTel) {
        this.encPersoTel = encPersoTel;
    }

    public String getEncUboTel() {
        return encUboTel;
    }

    public void setEncUboTel(String encUboTel) {
        this.encUboTel = encUboTel;
    }

    public String getEncPersoEmail() {
        return encPersoEmail;
    }

    public void setEncPersoEmail(String encPersoEmail) {
        this.encPersoEmail = encPersoEmail;
    }

    public String getEncUboEmail() {
        return encUboEmail;
    }

    public void setEncUboEmail(String encUboEmail) {
        this.encUboEmail = encUboEmail;
    }

    public String getIntNoInsee() {
        return intNoInsee;
    }

    public void setIntNoInsee(String intNoInsee) {
        this.intNoInsee = intNoInsee;
    }

    public String getIntSocNom() {
        return intSocNom;
    }

    public void setIntSocNom(String intSocNom) {
        this.intSocNom = intSocNom;
    }

    public String getIntSocAdresse() {
        return intSocAdresse;
    }

    public void setIntSocAdresse(String intSocAdresse) {
        this.intSocAdresse = intSocAdresse;
    }

    public String getIntSocCp() {
        return intSocCp;
    }

    public void setIntSocCp(String intSocCp) {
        this.intSocCp = intSocCp;
    }

    public String getIntSocVille() {
        return intSocVille;
    }

    public void setIntSocVille(String intSocVille) {
        this.intSocVille = intSocVille;
    }

    public String getIntSocPays() {
        return intSocPays;
    }

    public void setIntSocPays(String intSocPays) {
        this.intSocPays = intSocPays;
    }

    public String getIntFonction() {
        return intFonction;
    }

    public void setIntFonction(String intFonction) {
        this.intFonction = intFonction;
    }

    public String getIntProfEmail() {
        return intProfEmail;
    }

    public void setIntProfEmail(String intProfEmail) {
        this.intProfEmail = intProfEmail;
    }

    public String getIntProfTel() {
        return intProfTel;
    }

    public void setIntProfTel(String intProfTel) {
        this.intProfTel = intProfTel;
    }

}