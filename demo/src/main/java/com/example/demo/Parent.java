package com.example.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
public class Parent extends admin{
    @Id
    @Column(name = "parentid")
    private Long ParentId; 
    @OneToMany
    @JoinColumn(name = "enfantid")
    private Enfant enfant;  
}