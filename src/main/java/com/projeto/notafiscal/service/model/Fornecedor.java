package com.projeto.notafiscal.service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpjCpf;

    public Fornecedor(){

    }
    public Fornecedor(Long id, String nome, String cnpjCpf){
        this.id = id;
        this.nome = nome;
        this.cnpjCpf = cnpjCpf;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpjCpf() {
        return cnpjCpf;
    }
    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }
}
