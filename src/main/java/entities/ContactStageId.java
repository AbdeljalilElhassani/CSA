package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class ContactStageId implements Serializable {
    private static final long serialVersionUID = -6371747976124263763L;
    @NotNull
    @Column(name = "DATE_CONTACT", nullable = false)
    private Instant dateContact;

    @Size(max = 10)
    @NotNull
    @Column(name = "ANNEE_PRO", nullable = false, length = 10)
    private String anneePro;

    @Size(max = 50)
    @NotNull
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String noEtudiantNat;

    public Instant getDateContact() {
        return dateContact;
    }

    public void setDateContact(Instant dateContact) {
        this.dateContact = dateContact;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ContactStageId entity = (ContactStageId) o;
        return Objects.equals(this.dateContact, entity.dateContact) &&
                Objects.equals(this.noEtudiantNat, entity.noEtudiantNat) &&
                Objects.equals(this.anneePro, entity.anneePro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateContact, noEtudiantNat, anneePro);
    }

}