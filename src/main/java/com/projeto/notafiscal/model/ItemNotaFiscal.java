package com.projeto.notafiscal.model;

import jakarta.persistence.Entity;

@Entity
public class ItemNotaFiscal {

    private Long id;
    private String nome;
    private String cnpjCpf;

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
