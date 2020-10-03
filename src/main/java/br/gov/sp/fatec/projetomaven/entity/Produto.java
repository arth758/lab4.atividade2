package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Produto")
@Entity
public class Produto {
    
    @Id
    @Column(name = "Prod_cod")
    private Integer prodCod;

    @Column(name = "Prod_nome")
    private String prodNome;

    @Column(name = "Prod_marca")
    private String prodMarca;
    
    @Column(name = "Prod_un_medida")
    private String prodUnMedida;
    
    @Column(name = "Prod_preco")
    private Double prodPreco;

    public Integer getProdCod() {
        return prodCod;
    }

    public void setProdCod(Integer prodCod) {
        this.prodCod = prodCod;
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    public String getProdMarca() {
        return prodMarca;
    }

    public void setProdMarca(String prodMarca) {
        this.prodMarca = prodMarca;
    }

    public String getProdUnMedida() {
        return prodUnMedida;
    }

    public void setProdUnMedida(String prodUnMedida) {
        this.prodUnMedida = prodUnMedida;
    }

    public Double getProdPreco() {
        return prodPreco;
    }

    public void setProdPreco(Double prodPreco) {
        this.prodPreco = prodPreco;
    }

    
}