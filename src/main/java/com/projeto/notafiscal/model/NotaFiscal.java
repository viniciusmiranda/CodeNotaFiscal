package com.projeto.notafiscal.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String chaveAcesso;
    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;
    private BigDecimal valorTotal;
    private LocalDate dataEmissao;
    private String statusSefaz;
    private boolean valida;
    private String motivoInvalidade;

    @OneToMany(mappedBy = "notaFiscal")
    private List<ItemNotaFiscal> itens;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getChaveAcesso() {
        return chaveAcesso;
    }
    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public BigDecimal getVlaorTotal() {
        return valorTotal;
    }
    public void setVlaorTotal(BigDecimal vlaorTotal) {
        this.valorTotal = vlaorTotal;
    }
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public String getStatusSefaz() {
        return statusSefaz;
    }
    public void setStatusSefaz(String statusSefaz) {
        this.statusSefaz = statusSefaz;
    }
    public boolean isValida() {
        return valida;
    }
    public void setValida(boolean valida) {
        this.valida = valida;
    }
    public String getMotivoInvalidade() {
        return motivoInvalidade;
    }
    public void setMotivoInvalidade(String motivoInvalidade) {
        this.motivoInvalidade = motivoInvalidade;
    }
    public List<ItemNotaFiscal> getItens() {
        return itens;
    }
    public void setItens(List<ItemNotaFiscal> itens) {
        this.itens = itens;
    }
}