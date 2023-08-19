package com.example.demo;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "enfant")
public class Enfant {   
    @Id
    @Column(name = "enfantid")
    private Long EnfantId;
    @Column(name = "datenaissance")
    private Date dateNaissance;
    @Column(name = "age")
    private int age;
    @OneToOne(mappedBy = "parentid")
    private Parent ParentId;
}