package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PosteEntrepriseId implements Serializable {
    private static final long serialVersionUID = -8125789115245614348L;
    @Size(max = 50)
    @NotNull
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String noEtudiantNat;

    @NotNull
    @Column(name = "NO_ENTREPRISE", nullable = false)
    private Double noEntreprise;

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Double getNoEntreprise() {
        return noEntreprise;
    }

    public void setNoEntreprise(Double noEntreprise) {
        this.noEntreprise = noEntreprise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PosteEntrepriseId entity = (PosteEntrepriseId) o;
        return Objects.equals(this.noEntreprise, entity.noEntreprise) &&
                Objects.equals(this.noEtudiantNat, entity.noEtudiantNat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noEntreprise, noEtudiantNat);
    }

}