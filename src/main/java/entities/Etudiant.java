package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @Size(max = 50)
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String noEtudiantNat;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE_PRO", nullable = false)
    private Promotion anneePro;

    @Size(max = 10)
    @Column(name = "CODE_COM", length = 10)
    private String codeCom;

    @Size(max = 20)
    @Column(name = "NO_ETUDIANT_UBO", length = 20)
    private String noEtudiantUbo;

    @Size(max = 1)
    @NotNull
    @Column(name = "SEXE", nullable = false, length = 1)
    private String sexe;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @NotNull
    @Column(name = "DATE_NAISSANCE", nullable = false)
    private Instant dateNaissance;

    @Size(max = 255)
    @NotNull
    @Column(name = "LIEU_NAISSANCE", nullable = false)
    private String lieuNaissance;

    @Size(max = 3)
    @NotNull
    @Column(name = "SITUATION", nullable = false, length = 3)
    private String situation;

    @Size(max = 50)
    @NotNull
    @Column(name = "NATIONALITE", nullable = false, length = 50)
    private String nationalite;

    @Size(max = 20)
    @Column(name = "TEL_PORT", length = 20)
    private String telPort;

    @Size(max = 20)
    @Column(name = "TEL_FIXE", length = 20)
    private String telFixe;

    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;

    @Size(max = 255)
    @Column(name = "ACTU_ADRESSE")
    private String actuAdresse;

    @Size(max = 10)
    @Column(name = "ACTU_CP", length = 10)
    private String actuCp;

    @Size(max = 255)
    @Column(name = "ACTU_VILLE")
    private String actuVille;

    @Size(max = 255)
    @Column(name = "ACTU_PAYS")
    private String actuPays;

    @Size(max = 255)
    @NotNull
    @Column(name = "PERM_ADRESSE", nullable = false)
    private String permAdresse;

    @Size(max = 10)
    @NotNull
    @Column(name = "PERM_CP", nullable = false, length = 10)
    private String permCp;

    @Size(max = 255)
    @NotNull
    @Column(name = "PERM_VILLE", nullable = false)
    private String permVille;

    @Size(max = 255)
    @NotNull
    @Column(name = "PERM_PAYS", nullable = false)
    private String permPays;

    @Size(max = 255)
    @NotNull
    @Column(name = "DERNIER_DIPLOME", nullable = false)
    private String dernierDiplome;

    @Size(max = 255)
    @NotNull
    @Column(name = "UNIVERSITE", nullable = false)
    private String universite;

    @Size(max = 3)
    @NotNull
    @Column(name = "SIGLE_ETU", nullable = false, length = 3)
    private String sigleEtu;

    @Size(max = 10)
    @NotNull
    @Column(name = "COMPTE_CRI", nullable = false, length = 10)
    private String compteCri;

    @Size(max = 255)
    @Column(name = "UBO_EMAIL")
    private String uboEmail;

    @Column(name = "GRPE_ANGLAIS")
    private Byte grpeAnglais;

    @Size(max = 255)
    @Column(name = "ABANDON_MOTIF")
    private String abandonMotif;

    @Column(name = "ABANDON_DATE")
    private Instant abandonDate;

    @Column(name = "EST_DIPLOME")
    private Character estDiplome;

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Promotion getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(Promotion anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeCom() {
        return codeCom;
    }

    public void setCodeCom(String codeCom) {
        this.codeCom = codeCom;
    }

    public String getNoEtudiantUbo() {
        return noEtudiantUbo;
    }

    public void setNoEtudiantUbo(String noEtudiantUbo) {
        this.noEtudiantUbo = noEtudiantUbo;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

    public Instant getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Instant dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActuAdresse() {
        return actuAdresse;
    }

    public void setActuAdresse(String actuAdresse) {
        this.actuAdresse = actuAdresse;
    }

    public String getActuCp() {
        return actuCp;
    }

    public void setActuCp(String actuCp) {
        this.actuCp = actuCp;
    }

    public String getActuVille() {
        return actuVille;
    }

    public void setActuVille(String actuVille) {
        this.actuVille = actuVille;
    }

    public String getActuPays() {
        return actuPays;
    }

    public void setActuPays(String actuPays) {
        this.actuPays = actuPays;
    }

    public String getPermAdresse() {
        return permAdresse;
    }

    public void setPermAdresse(String permAdresse) {
        this.permAdresse = permAdresse;
    }

    public String getPermCp() {
        return permCp;
    }

    public void setPermCp(String permCp) {
        this.permCp = permCp;
    }

    public String getPermVille() {
        return permVille;
    }

    public void setPermVille(String permVille) {
        this.permVille = permVille;
    }

    public String getPermPays() {
        return permPays;
    }

    public void setPermPays(String permPays) {
        this.permPays = permPays;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSigleEtu() {
        return sigleEtu;
    }

    public void setSigleEtu(String sigleEtu) {
        this.sigleEtu = sigleEtu;
    }

    public String getCompteCri() {
        return compteCri;
    }

    public void setCompteCri(String compteCri) {
        this.compteCri = compteCri;
    }

    public String getUboEmail() {
        return uboEmail;
    }

    public void setUboEmail(String uboEmail) {
        this.uboEmail = uboEmail;
    }

    public Byte getGrpeAnglais() {
        return grpeAnglais;
    }

    public void setGrpeAnglais(Byte grpeAnglais) {
        this.grpeAnglais = grpeAnglais;
    }

    public String getAbandonMotif() {
        return abandonMotif;
    }

    public void setAbandonMotif(String abandonMotif) {
        this.abandonMotif = abandonMotif;
    }

    public Instant getAbandonDate() {
        return abandonDate;
    }

    public void setAbandonDate(Instant abandonDate) {
        this.abandonDate = abandonDate;
    }

    public Character getEstDiplome() {
        return estDiplome;
    }

    public void setEstDiplome(Character estDiplome) {
        this.estDiplome = estDiplome;
    }

}