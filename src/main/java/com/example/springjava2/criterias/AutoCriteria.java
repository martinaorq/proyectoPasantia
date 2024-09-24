package com.example.springjava2.criterias;

import java.math.BigDecimal;

public class AutoCriteria {
    BigDecimal precioInicial;
    BigDecimal precioFinal;
    String modelo;
    Long id;
    Integer antiguedadInicial;
    Integer antiguedadFinal;
    Integer cantInteresados;

    public BigDecimal getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(BigDecimal precioInicial) {
        this.precioInicial = precioInicial;
    }

    public BigDecimal getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(BigDecimal precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAntiguedadInicial() {
        return antiguedadInicial;
    }

    public void setAntiguedadInicial(Integer antiguedadInicial) {
        this.antiguedadInicial = antiguedadInicial;
    }

    public Integer getAntiguedadFinal() {
        return antiguedadFinal;
    }

    public void setAntiguedadFinal(Integer antiguedadFinal) {
        this.antiguedadFinal = antiguedadFinal;
    }

    public Integer getCantInteresados() {
        return cantInteresados;
    }

    public void setCantInteresados(Integer cantInteresados) {
        this.cantInteresados = cantInteresados;
    }
}
