package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "poste_entreprise")
public class PosteEntreprise {
    @EmbeddedId
    private PosteEntrepriseId id;

    @MapsId("noEtudiantNat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ETUDIANT_NAT", nullable = false)
    private Diplome noEtudiantNat;

    @MapsId("noEntreprise")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ENTREPRISE", nullable = false)
    private Entreprise noEntreprise;

    @Size(max = 5)
    @NotNull
    @Column(name = "FONCTION", nullable = false, length = 5)
    private String fonction;

    @NotNull
    @Column(name = "DATE_EMBAUCHE", nullable = false)
    private Instant dateEmbauche;

    @Size(max = 3)
    @NotNull
    @Column(name = "MOYEN_OBTENTION", nullable = false, length = 3)
    private String moyenObtention;

    @Size(max = 5)
    @Column(name = "SERVICE", length = 5)
    private String service;

    @Column(name = "BRUT_ANNUEL")
    private Integer brutAnnuel;

    public PosteEntrepriseId getId() {
        return id;
    }

    public void setId(PosteEntrepriseId id) {
        this.id = id;
    }

    public Diplome getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(Diplome noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Entreprise getNoEntreprise() {
        return noEntreprise;
    }

    public void setNoEntreprise(Entreprise noEntreprise) {
        this.noEntreprise = noEntreprise;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Instant getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Instant dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getMoyenObtention() {
        return moyenObtention;
    }

    public void setMoyenObtention(String moyenObtention) {
        this.moyenObtention = moyenObtention;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getBrutAnnuel() {
        return brutAnnuel;
    }

    public void setBrutAnnuel(Integer brutAnnuel) {
        this.brutAnnuel = brutAnnuel;
    }

}