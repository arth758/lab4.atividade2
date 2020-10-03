package br.gov.sp.fatec.projetomaven.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Cliente")
@Entity
public class Cliente {

    @Id
    @Column(name = "Cli_CPF_CNPJ")
    private String cliCpfCnpj;

    @Column(name = "Cli_nome")
    private String cliNome;

    @Column(name = "Cli_email")
    private String cliEmail;

    @Column(name = "Cli_senha")
    private String cliSenha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "Cartao", joinColumns = { @JoinColumn(name = "Cli_CPF_CNPJ") }, inverseJoinColumns = {@JoinColumn(name="Car_numero")})
    private Set<Cartao> cliCartoes;

    public String getCliCpfCnpj() {
        return cliCpfCnpj;
    }

    public void setCliCpfCnpj(String cliCpfCnpj) {
        this.cliCpfCnpj = cliCpfCnpj;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliSenha() {
        return cliSenha;
    }

    public void setCliSenha(String cliSenha) {
        this.cliSenha = cliSenha;
    }

    public Set<Cartao> getCliCartoes() {
        return cliCartoes;
    }

    public void setCliCartoes(Set<Cartao> cliCartoes) {
        this.cliCartoes = cliCartoes;
    }

}