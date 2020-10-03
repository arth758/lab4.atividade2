package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Produto_Fornecedor", uniqueConstraints = { @UniqueConstraint(columnNames = { "Forn_cod", "Prod_cod" }) })
public class ProdutoFornecedor {

    @OneToMany
    @JoinColumn(name = "Forn_cod")
    private Integer fornCod;

    @OneToMany
    @JoinColumn(name = "Prod_cod")
    private Integer prodCod;

    public Integer getFornCod() {
        return fornCod;
    }

    public void setFornCod(Integer fornCod) {
        this.fornCod = fornCod;
    }

	public Integer getProdCod() {
		return prodCod;
	}

	public void setProdCod(Integer prodCod) {
		this.prodCod = prodCod;
	}
}