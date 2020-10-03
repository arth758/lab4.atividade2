package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class Endereço {

    @Id
    @Column(name = "end_id")
    private Integer endId;

    @Column(name = "end_logradouro")
    private String endLogradouro;

    @Column(name = "end_bairro")
    private String endBairro;

    @Column(name = "end_cidade")
    private String endCidade;

     @Column(name = "end_cep")
    private String endCep;

    @Column(name = "end_cmpl")
    private String endCmpl;

    @Column(name = "end_numero")
    private String endNumero;

    public Integer getEndId() {
        return endId;
    }

    public void setEndId(Integer endId) {
        this.endId = endId;
    }

    public String getEndLogradouro() {
        return endLogradouro;
    }

    public void setEndLogradouro(String endLogradouro) {
        this.endLogradouro = endLogradouro;
    }

    public String getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public String getEndCmpl() {
        return endCmpl;
    }

    public void setEndCmpl(String endCmpl) {
        this.endCmpl = endCmpl;
    }

    public String getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(String endNumero) {
        this.endNumero = endNumero;
    }

   
}
