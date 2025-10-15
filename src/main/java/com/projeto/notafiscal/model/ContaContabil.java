package com.projeto.notafiscal.service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conta_contabil")
public class ContaContabil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descricao;
    public ContaContabil(){

    }
    public ContaContabil(Long id, String codigo, String descricao){
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
