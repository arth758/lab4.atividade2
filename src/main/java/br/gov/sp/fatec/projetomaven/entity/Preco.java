package br.gov.sp.fatec.projetomaven.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Table(name = "Preco", uniqueConstraints = {@UniqueConstraint(columnNames = {"Prod_cod, Preco_data"})})
@Entity
public class Preco {
    @OneToOne
    @JoinColumn(name = "Prod_cod")
    private String preProdCod;

    @Column(name = "Preco_data")
    private Date preData;

    @Column(name = "Valor")
    private Double preValor;

    public String getPreProdCod() {
        return preProdCod;
    }

    public void setPreProdCod(String preProdCod) {
        this.preProdCod = preProdCod;
    }

    public Date getPreData() {
        return preData;
    }

    public void setPreData(Date preData) {
        this.preData = preData;
    }

    public Double getPreValor() {
        return preValor;
    }

    public void setPreValor(Double preValor) {
        this.preValor = preValor;
    }

}