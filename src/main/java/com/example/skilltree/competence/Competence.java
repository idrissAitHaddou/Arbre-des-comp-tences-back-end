package com.example.skilltree.competence;

import com.example.skilltree.skillsReference.ReferenceSkill;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "competences")
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;
    @OneToOne
    @JoinColumn(name = "id_reference", referencedColumnName = "id")
    private ReferenceSkill referenceSkill;
    @OneToMany
    @JoinColumn(name = "id_validate_competence", referencedColumnName = "id")
    private List<ValidateCompetence> validateCompetences;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReferenceSkill getSkill() {
        return referenceSkill;
    }

    public void setSkill(ReferenceSkill skill) {
        this.referenceSkill = skill;
    }

    public List<ValidateCompetence> getValidateCompetences() {
        return validateCompetences;
    }

    public void setValidateCompetences(List<ValidateCompetence> validateCompetences) {
        this.validateCompetences = validateCompetences;
    }
}
