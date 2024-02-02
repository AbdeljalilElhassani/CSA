package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "evaluation_entreprise")
public class EvaluationEntreprise {
    @EmbeddedId
    private EvaluationEntrepriseId id;

    @MapsId("id")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "NO_ETUDIANT_NAT", nullable = false),
            @JoinColumn(name = "NO_ETUDIANT_NAT", referencedColumnName = "ANNEE_PRO", nullable = false)
    })
    private Stage stage;

    @NotNull
    @Column(name = "DATE_MAJ", nullable = false)
    private Instant dateMaj;

    @Size(max = 3)
    @NotNull
    @Column(name = "ETAT", nullable = false, length = 3)
    private String etat;

    public EvaluationEntrepriseId getId() {
        return id;
    }

    public void setId(EvaluationEntrepriseId id) {
        this.id = id;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Instant getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Instant dateMaj) {
        this.dateMaj = dateMaj;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

}