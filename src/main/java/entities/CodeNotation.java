package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "code_notation")
public class CodeNotation {
    @Id
    @Column(name = "CODN_ID", nullable = false)
    private Double id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NO_BAREME", nullable = false)
    private NotationStage noBareme;

    @Size(max = 3)
    @NotNull
    @Column(name = "CODE_NOTE", nullable = false, length = 3)
    private String codeNote;

    @Size(max = 50)
    @NotNull
    @Column(name = "DESIGNATION", nullable = false, length = 50)
    private String designation;

    @NotNull
    @Column(name = "VALEUR_NOTE", nullable = false)
    private Double valeurNote;

    @Lob
    @Column(name = "DESCRIPTIF")
    private String descriptif;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public NotationStage getNoBareme() {
        return noBareme;
    }

    public void setNoBareme(NotationStage noBareme) {
        this.noBareme = noBareme;
    }

    public String getCodeNote() {
        return codeNote;
    }

    public void setCodeNote(String codeNote) {
        this.codeNote = codeNote;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getValeurNote() {
        return valeurNote;
    }

    public void setValeurNote(Double valeurNote) {
        this.valeurNote = valeurNote;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

}