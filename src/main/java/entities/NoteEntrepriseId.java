package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NoteEntrepriseId implements Serializable {
    private static final long serialVersionUID = 4917823275020564123L;
    @Size(max = 50)
    @NotNull
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String noEtudiantNat;

    @Size(max = 10)
    @NotNull
    @Column(name = "ANNEE_PRO", nullable = false, length = 10)
    private String anneePro;

    @NotNull
    @Column(name = "CRITE_ID", nullable = false)
    private Double criteId;

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public Double getCriteId() {
        return criteId;
    }

    public void setCriteId(Double criteId) {
        this.criteId = criteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        NoteEntrepriseId entity = (NoteEntrepriseId) o;
        return Objects.equals(this.noEtudiantNat, entity.noEtudiantNat) &&
                Objects.equals(this.criteId, entity.criteId) &&
                Objects.equals(this.anneePro, entity.anneePro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noEtudiantNat, criteId, anneePro);
    }

}