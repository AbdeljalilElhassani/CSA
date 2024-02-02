package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employe")
public class Employe {
    @Id
    @Column(name = "NO_CONTACT_ILI", nullable = false)
    private Double id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENTREPRISE", nullable = false)
    private Entreprise noEntreprise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_ETUDIANT_NAT")
    private Diplome noEtudiantNat;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @Size(max = 100)
    @Column(name = "MAIL_PRO", length = 100)
    private String mailPro;

    @Size(max = 20)
    @Column(name = "TEL_PRO", length = 20)
    private String telPro;

    @Size(max = 5)
    @Column(name = "FONCTION", length = 5)
    private String fonction;

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

    public Diplome getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(Diplome noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
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

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

}