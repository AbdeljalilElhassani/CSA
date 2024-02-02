package entities;

import jakarta.persistence.*;

@Entity
public class userRole {

    @EmbeddedId
    private userRoleId userRoleId;

    @ManyToOne
    @JoinColumn(name = "idUser", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "idRole", insertable = false, updatable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "NO_ENSEIGNANT", nullable = true)
    private Enseignant enseignant;

    @ManyToOne
    @JoinColumn(name = "NO_CONTACT_ILI", nullable = true)
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "NO_ETUDIANT_NAT", nullable = true)
    private Etudiant etudiant;

    public userRole(entities.userRoleId userRoleId, User user, Role role, Enseignant enseignant, Employe employe, Etudiant etudiant) {
        this.userRoleId = userRoleId;
        this.user = user;
        this.role = role;
        this.enseignant = enseignant;
        this.employe = employe;
        this.etudiant = etudiant;
    }


    public userRoleId getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(userRoleId userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
