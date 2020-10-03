package br.gov.sp.fatec.projetomaven.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Funcionario")
@Entity
public class Funcionario {

    @Column(name = "Func_nome")
    private String funcNome;

    @Column(name = "Func_email")
    private String funcEmail;

    @Column(name = "Func_senha")
    private String funcSenha;

    @Column(name = "Func_salario")
    private Double funcSalario;

    @Id
    @Column(name = "Func_CPF_CNPJ")
    private String funcCpfCnpj;

    public String getFuncNome() {
        return funcNome;
    }

    public void setFuncNome(String funcNome) {
        this.funcNome = funcNome;
    }

    public String getFuncEmail() {
        return funcEmail;
    }

    public void setFuncEmail(String funcEmail) {
        this.funcEmail = funcEmail;
    }

    public String getFuncSenha() {
        return funcSenha;
    }

    public void setFuncSenha(String funcSenha) {
        this.funcSenha = funcSenha;
    }

    public Double getFuncSalario() {
        return funcSalario;
    }

    public void setFuncSalario(Double funcSalario) {
        this.funcSalario = funcSalario;
    }

    public String getFuncCpfCnpj() {
        return funcCpfCnpj;
    }

    public void setFuncCpfCnpj(String funcCpfCnpj) {
        this.funcCpfCnpj = funcCpfCnpj;
    }    
}