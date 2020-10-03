package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Produto_venda")
public class ProdutoVenda {

    @OneToMany
    @JoinColumn(name = "Prod_cod")
    private Integer prodCod;

    @OneToOne
    @JoinColumn(name = "Cod_venda")
    private Integer vendaCod;

    @Column(name = "Quantidade_Prod")
    private Integer qtdeProd;

    public Integer getProdCod() {
        return prodCod;
    }

    public void setProdCod(Integer prodCod) {
        this.prodCod = prodCod;
    }

    public Integer getVendaCod() {
        return vendaCod;
    }

    public void setVendaCod(Integer vendaCod) {
        this.vendaCod = vendaCod;
    }

    public Integer getQtdeProd() {
        return qtdeProd;
    }

    public void setQtdeProd(Integer qtdeProd) {
        this.qtdeProd = qtdeProd;
    }

    
}