package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "contact_stage")
public class ContactStage {
    @EmbeddedId
    private ContactStageId id;

    @MapsId("noEtudiantNat")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_ETUDIANT_NAT", nullable = false)
    private Etudiant noEtudiantNat;

    @Size(max = 3)
    @NotNull
    @Column(name = "TYPE_CONTACT", nullable = false, length = 3)
    private String typeContact;

    @Size(max = 3)
    @Column(name = "INTERLOCUTEUR", length = 3)
    private String interlocuteur;

    @Size(max = 255)
    @NotNull
    @Column(name = "OBJET", nullable = false)
    private String objet;

    @Size(max = 20)
    @Column(name = "DUREE", length = 20)
    private String duree;

    @Lob
    @Column(name = "RESUME")
    private String resume;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_CONTACT_ILI")
    private Employe noContactIli;

    @Size(max = 20)
    @Column(name = "HEURE_CONTACT", length = 20)
    private String heureContact;

    public ContactStageId getId() {
        return id;
    }

    public void setId(ContactStageId id) {
        this.id = id;
    }

    public Etudiant getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(Etudiant noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public String getInterlocuteur() {
        return interlocuteur;
    }

    public void setInterlocuteur(String interlocuteur) {
        this.interlocuteur = interlocuteur;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Employe getNoContactIli() {
        return noContactIli;
    }

    public void setNoContactIli(Employe noContactIli) {
        this.noContactIli = noContactIli;
    }

    public String getHeureContact() {
        return heureContact;
    }

    public void setHeureContact(String heureContact) {
        this.heureContact = heureContact;
    }

}