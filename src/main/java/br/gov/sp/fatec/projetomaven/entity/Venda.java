package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Venda")
public class Venda {
    @Id
    @Column(name = "Cod_venda")
    private Integer vendaCod;

    @Column(name = "Valor_total_venda")
    private Double valorTotalVenda;
    
    @Column(name="Forma_pgto_venda")
    private String formaPgtoVenda;
    
    @OneToMany
    @JoinColumn(name = "CPF_CNPJ")
    private String cpfCnpj;

    @OneToMany
    @JoinColumn(name = "Prod_cod")
    private String prodCod;

    public Integer getVendaCod() {
        return vendaCod;
    }

    public void setVendaCod(Integer vendaCod) {
        this.vendaCod = vendaCod;
    }

    public Double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(Double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public String getFormaPgtoVenda() {
        return formaPgtoVenda;
    }

    public void setFormaPgtoVenda(String formaPgtoVenda) {
        this.formaPgtoVenda = formaPgtoVenda;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getProdCod() {
        return prodCod;
    }

    public void setProdCod(String prodCod) {
        this.prodCod = prodCod;
    }

}