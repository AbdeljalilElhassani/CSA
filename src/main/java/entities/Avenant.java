package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "avenant")
public class Avenant {
    @Id
    @Column(name = "NO_AVENANT", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "NO_ETUDIANT_NAT", nullable = false),
            @JoinColumn(name = "NO_ETUDIANT_NAT", referencedColumnName = "ANNEE_PRO", nullable = false)
    })
    private Stage stage;

    @Size(max = 255)
    @NotNull
    @Column(name = "ETAT_AVENANT", nullable = false)
    private String etatAvenant;

    @NotNull
    @Column(name = "NUM_ARTICLE", nullable = false)
    private Integer numArticle;

    @Column(name = "DATE_SIGNATURE_AVE")
    private Instant dateSignatureAve;

    @Size(max = 255)
    @NotNull
    @Column(name = "MODIF_APPORTEE", nullable = false)
    private String modifApportee;

    @Size(max = 255)
    @Column(name = "COMMENTAIRE")
    private String commentaire;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getEtatAvenant() {
        return etatAvenant;
    }

    public void setEtatAvenant(String etatAvenant) {
        this.etatAvenant = etatAvenant;
    }

    public Integer getNumArticle() {
        return numArticle;
    }

    public void setNumArticle(Integer numArticle) {
        this.numArticle = numArticle;
    }

    public Instant getDateSignatureAve() {
        return dateSignatureAve;
    }

    public void setDateSignatureAve(Instant dateSignatureAve) {
        this.dateSignatureAve = dateSignatureAve;
    }

    public String getModifApportee() {
        return modifApportee;
    }

    public void setModifApportee(String modifApportee) {
        this.modifApportee = modifApportee;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}