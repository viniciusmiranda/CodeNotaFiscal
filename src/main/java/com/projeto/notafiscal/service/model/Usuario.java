package com.projeto.notafiscal.service.model;

import jakarta.persistence.*;

@Entity
@Table (name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String perfil;

    public Usuario() {
        
    }

    public Usuario(Long id, String email, String perfil){
        this.id = id;
        this.email = email;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
