package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "visite_stage")
public class VisiteStage {
    @EmbeddedId
    private VisiteStageId id;

    @MapsId("id")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "NO_ETUDIANT_NAT", referencedColumnName = "NO_ETUDIANT_NAT", nullable = false),
            @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "ANNEE_PRO", nullable = false)
    })
    private Stage stage;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_CONTACT_ILI", nullable = false)
    private Employe noContactIli;

    @Size(max = 3)
    @NotNull
    @Column(name = "TYPE_CONTACT", nullable = false, length = 3)
    private String typeContact;

    @NotNull
    @Column(name = "DATE_PREVISIONNELLE", nullable = false)
    private Instant datePrevisionnelle;

    @Size(max = 20)
    @Column(name = "HEURE_PREVISIONNELLE", length = 20)
    private String heurePrevisionnelle;

    @Column(name = "DATE_EFFECTIVE")
    private Instant dateEffective;

    @Size(max = 20)
    @Column(name = "HEURE_EFFECTIVE", length = 20)
    private String heureEffective;

    @Size(max = 20)
    @Column(name = "DUREE", length = 20)
    private String duree;

    @Lob
    @Column(name = "COMMENTAIRE_TUTEUR_UBO")
    private String commentaireTuteurUbo;

    public VisiteStageId getId() {
        return id;
    }

    public void setId(VisiteStageId id) {
        this.id = id;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Employe getNoContactIli() {
        return noContactIli;
    }

    public void setNoContactIli(Employe noContactIli) {
        this.noContactIli = noContactIli;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public Instant getDatePrevisionnelle() {
        return datePrevisionnelle;
    }

    public void setDatePrevisionnelle(Instant datePrevisionnelle) {
        this.datePrevisionnelle = datePrevisionnelle;
    }

    public String getHeurePrevisionnelle() {
        return heurePrevisionnelle;
    }

    public void setHeurePrevisionnelle(String heurePrevisionnelle) {
        this.heurePrevisionnelle = heurePrevisionnelle;
    }

    public Instant getDateEffective() {
        return dateEffective;
    }

    public void setDateEffective(Instant dateEffective) {
        this.dateEffective = dateEffective;
    }

    public String getHeureEffective() {
        return heureEffective;
    }

    public void setHeureEffective(String heureEffective) {
        this.heureEffective = heureEffective;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getCommentaireTuteurUbo() {
        return commentaireTuteurUbo;
    }

    public void setCommentaireTuteurUbo(String commentaireTuteurUbo) {
        this.commentaireTuteurUbo = commentaireTuteurUbo;
    }

}