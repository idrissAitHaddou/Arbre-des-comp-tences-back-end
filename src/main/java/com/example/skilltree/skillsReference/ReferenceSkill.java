package com.example.skilltree.skillsReference;

import com.example.skilltree.competence.Competence;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "referencec_skill")
public class ReferenceSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;
    @Column(name = "shortname")
    @Basic
    private String shortname;
    @OneToMany
    @JoinColumn(name = "id_comptence", referencedColumnName = "id")
    private List<Competence> competences;

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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }
}
