package com.example.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "admin")
public class admin {
    @Id
    @Column(name = "adminid")
    protected Long AdminId;
    @Column(name = "nom")
    protected String nom;
    @Column(name = "prenom")
    protected String prenom;
    @Column(name = "email")
    protected String email;
    @Column(name = "tel")
    protected String tel;
    @Column(name = "adresse")
    protected String asresse;
    @OneToOne(mappedBy = "inscriptionid")
    protected Inscription inscriptionIdInscription;
    @Column(name = "login")
    protected String login;
    @Column(name = "password")
    protected String password;
    //getters & setters
    //adminId
    public Long getAdminId(){
        return AdminId;
    }
    public void setAdminId(Long Id){
        this.AdminId=Id;
    }
    //nom
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    //prenom
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    //email
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=Email;
    }
}