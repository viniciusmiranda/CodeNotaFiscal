package com.projeto.notafiscal.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "nota_fiscal_id")
    private NotaFiscal notaFiscal;
    @ManyToOne
    @JoinColumn(name = "conta_contabil_id")
    private ContaContabil contaContabil;
    private BigDecimal valorLancado;
    private LocalDateTime dataLancamento;
    private String tipoLancamento;
    private boolean conferido;
    private BigDecimal valorEsperado;
    private boolean divergenciaValor;
    private String status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    public ContaContabil getContaContabil() {
        return contaContabil;
    }
    public void setContaContabil(ContaContabil contaContabil) {
        this.contaContabil = contaContabil;
    }
    public BigDecimal getValorLancado() {
        return valorLancado;
    }
    public void setValorLancado(BigDecimal valorLancado) {
        this.valorLancado = valorLancado;
    }
    public LocalDateTime getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(LocalDateTime dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getTipoLancamento() {
        return tipoLancamento;
    }
    public void setTipoLancamento(String tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }
    public boolean isConferido() {
        return conferido;
    }
    public void setConferido(boolean conferido) {
        this.conferido = conferido;
    }
    public BigDecimal getValorEsperado() {
        return valorEsperado;
    }
    public void setValorEsperado(BigDecimal valorEsperado) {
        this.valorEsperado = valorEsperado;
    }
    public boolean isDivergenciaValor() {
        return divergenciaValor;
    }
    public void setDivergenciaValor(boolean divergenciaValor) {
        this.divergenciaValor = divergenciaValor;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
