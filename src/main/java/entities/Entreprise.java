package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "entreprise")
public class Entreprise {
    @Id
    @Column(name = "NO_ENTREPRISE", nullable = false)
    private Double id;

    @Column(name = "REFERENCEE")
    private Character referencee;

    @Column(name = "DATE_REFERENCEMENT")
    private Instant dateReferencement;

    @Size(max = 8)
    @Column(name = "LOGIN_CREA", length = 8)
    private String loginCrea;

    @NotNull
    @Column(name = "DATE_CREA", nullable = false)
    private Instant dateCrea;

    @Size(max = 100)
    @NotNull
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @Size(max = 100)
    @NotNull
    @Column(name = "SIEGE_SOCIAL", nullable = false, length = 100)
    private String siegeSocial;

    @Size(max = 5)
    @NotNull
    @Column(name = "DOMAINE_ACTIVITE", nullable = false, length = 5)
    private String domaineActivite;

    @Size(max = 255)
    @NotNull
    @Column(name = "ADRESSE", nullable = false)
    private String adresse;

    @Size(max = 10)
    @NotNull
    @Column(name = "CP", nullable = false, length = 10)
    private String cp;

    @Size(max = 100)
    @NotNull
    @Column(name = "VILLE", nullable = false, length = 100)
    private String ville;

    @Size(max = 100)
    @NotNull
    @Column(name = "PAYS", nullable = false, length = 100)
    private String pays;

    @Size(max = 20)
    @NotNull
    @Column(name = "TEL", nullable = false, length = 20)
    private String tel;

    @Size(max = 150)
    @Column(name = "SITE_INTERNET", length = 150)
    private String siteInternet;

    @Size(max = 50)
    @Column(name = "NOM_REPRESENTANT", length = 50)
    private String nomRepresentant;

    @Size(max = 50)
    @Column(name = "PRENOM_REPRESENTANT", length = 50)
    private String prenomRepresentant;

    @Size(max = 8)
    @Column(name = "LOGIN_MAJ", length = 8)
    private String loginMaj;

    @Column(name = "DATE_MAJ")
    private Instant dateMaj;

    @Column(name = "OFFRE_STAGE")
    private Character offreStage;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Character getReferencee() {
        return referencee;
    }

    public void setReferencee(Character referencee) {
        this.referencee = referencee;
    }

    public Instant getDateReferencement() {
        return dateReferencement;
    }

    public void setDateReferencement(Instant dateReferencement) {
        this.dateReferencement = dateReferencement;
    }

    public String getLoginCrea() {
        return loginCrea;
    }

    public void setLoginCrea(String loginCrea) {
        this.loginCrea = loginCrea;
    }

    public Instant getDateCrea() {
        return dateCrea;
    }

    public void setDateCrea(Instant dateCrea) {
        this.dateCrea = dateCrea;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSiegeSocial() {
        return siegeSocial;
    }

    public void setSiegeSocial(String siegeSocial) {
        this.siegeSocial = siegeSocial;
    }

    public String getDomaineActivite() {
        return domaineActivite;
    }

    public void setDomaineActivite(String domaineActivite) {
        this.domaineActivite = domaineActivite;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    public String getNomRepresentant() {
        return nomRepresentant;
    }

    public void setNomRepresentant(String nomRepresentant) {
        this.nomRepresentant = nomRepresentant;
    }

    public String getPrenomRepresentant() {
        return prenomRepresentant;
    }

    public void setPrenomRepresentant(String prenomRepresentant) {
        this.prenomRepresentant = prenomRepresentant;
    }

    public String getLoginMaj() {
        return loginMaj;
    }

    public void setLoginMaj(String loginMaj) {
        this.loginMaj = loginMaj;
    }

    public Instant getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Instant dateMaj) {
        this.dateMaj = dateMaj;
    }

    public Character getOffreStage() {
        return offreStage;
    }

    public void setOffreStage(Character offreStage) {
        this.offreStage = offreStage;
    }

}