package com.example.skilltree.skills;

import jakarta.persistence.*;

@Entity
@Table(name = "validate_competence")
public class ValidateCompetence {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "id_user")
    @Basic
    private int id_user;
    @Column(name = "name")
    @Basic
    private String name;
    @Column(name = "first_level_status")
    @Basic
    private String first_level_status;
    @Column(name = "second_level_status")
    @Basic
    private String second_level_status;
    @Column(name = "thirth_level_status")
    @Basic
    private String thirth_level_status;
    @OneToOne
    @JoinColumn(name = "id_competence", referencedColumnName = "id")
    private Competence competence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_level_status() {
        return first_level_status;
    }

    public void setFirst_level_status(String first_level_status) {
        this.first_level_status = first_level_status;
    }

    public String getSecond_level_status() {
        return second_level_status;
    }

    public void setSecond_level_status(String second_level_status) {
        this.second_level_status = second_level_status;
    }

    public String getThirth_level_status() {
        return thirth_level_status;
    }

    public void setThirth_level_status(String thirth_level_status) {
        this.thirth_level_status = thirth_level_status;
    }

    public Competence getCompetence() {
        return competence;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }
}
