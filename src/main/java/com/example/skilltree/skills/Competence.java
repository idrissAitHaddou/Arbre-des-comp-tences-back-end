package com.example.skilltree.skills;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "competences")
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;
    @OneToOne
    @JoinColumn(name = "id_skill", referencedColumnName = "id")
    private Skill skill;
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public List<ValidateCompetence> getValidateCompetences() {
        return validateCompetences;
    }

    public void setValidateCompetences(List<ValidateCompetence> validateCompetences) {
        this.validateCompetences = validateCompetences;
    }
}
