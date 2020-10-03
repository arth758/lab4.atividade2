package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Fornecedor")
public class Fornecedor {

    @Column(name = "Forn_nome")
    private String fornNome;

    @Column(name = "Forn_categoria")
    private String fornCategoria;

    @Id
    @Column(name = "Forn_cod")
    private Integer fornCod;

    @ManyToMany
    @JoinColumn(name = "Endereco_id")
    private Integer enderecoId;

    public String getFornNome() {
        return fornNome;
    }

    public void setFornNome(String fornNome) {
        this.fornNome = fornNome;
    }

    public String getFornCategoria() {
        return fornCategoria;
    }

    public void setFornCategoria(String fornCategoria) {
        this.fornCategoria = fornCategoria;
    }

    public Integer getFornCod() {
        return fornCod;
    }

    public void setFornCod(Integer fornCod) {
        this.fornCod = fornCod;
    }
}