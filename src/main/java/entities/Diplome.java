package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "diplome")
public class Diplome {
    @Id
    @Size(max = 50)
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String noEtudiantNat;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ETUDIANT_NAT", nullable = false)
    private Etudiant etudiant;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @NotNull
    @Column(name = "AUTORISATION_ANNUAIRE", nullable = false)
    private Character autorisationAnnuaire;

    @Size(max = 3)
    @Column(name = "TYPE_EMPLOI", length = 3)
    private String typeEmploi;

    @Size(max = 100)
    @Column(name = "MAIL_PRO", length = 100)
    private String mailPro;

    @Size(max = 20)
    @Column(name = "TEL_PRO", length = 20)
    private String telPro;

    @Size(max = 100)
    @Column(name = "ADRESSE", length = 100)
    private String adresse;

    @Size(max = 10)
    @Column(name = "CP", length = 10)
    private String cp;

    @Size(max = 50)
    @Column(name = "VILLE", length = 50)
    private String ville;

    @Size(max = 100)
    @Column(name = "EMAIL_PERSO", length = 100)
    private String emailPerso;

    @Size(max = 20)
    @Column(name = "TEL_PERSO", length = 20)
    private String telPerso;

    @Size(max = 20)
    @Column(name = "PORTABLE", length = 20)
    private String portable;

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
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

    public Character getAutorisationAnnuaire() {
        return autorisationAnnuaire;
    }

    public void setAutorisationAnnuaire(Character autorisationAnnuaire) {
        this.autorisationAnnuaire = autorisationAnnuaire;
    }

    public String getTypeEmploi() {
        return typeEmploi;
    }

    public void setTypeEmploi(String typeEmploi) {
        this.typeEmploi = typeEmploi;
    }

    public String getMailPro() {
        return mailPro;
    }

    public void setMailPro(String mailPro) {
        this.mailPro = mailPro;
    }

    public String getTelPro() {
        return telPro;
    }

    public void setTelPro(String telPro) {
        this.telPro = telPro;
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

    public String getEmailPerso() {
        return emailPerso;
    }

    public void setEmailPerso(String emailPerso) {
        this.emailPerso = emailPerso;
    }

    public String getTelPerso() {
        return telPerso;
    }

    public void setTelPerso(String telPerso) {
        this.telPerso = telPerso;
    }

    public String getPortable() {
        return portable;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

}