package com.projeto.notafiscal.service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_nota_fiscal")
public class ItemNotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpjCpf;
    @ManyToOne
    @JoinColumn(name = "nota_fiscal_id")
    private NotaFiscal notaFiscal;
    public ItemNotaFiscal(){

    }
    public ItemNotaFiscal(Long id, String nome, String cnpjCpf){
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
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
