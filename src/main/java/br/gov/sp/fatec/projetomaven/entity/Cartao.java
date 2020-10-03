package br.gov.sp.fatec.projetomaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Cartao")
@Entity
public class Cartao {
    
    @Column(name = "Car_numero")
    private String carNumero;

    @Column(name = "Car_nome")
    private String carnome;

    @Column(name = "Car_data")
    private String carData;

    @Column(name = "Car_cod_seguranca")
    private String carCodSeguranca;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CPF_CNPJ")
    private String cpfCnpj;

    public String getCarNumero() {
        return carNumero;
    }

    public void setCarNumero(String carNumero) {
        this.carNumero = carNumero;
    }

    public String getCarnome() {
        return carnome;
    }

    public void setCarnome(String carnome) {
        this.carnome = carnome;
    }

    public String getCarData() {
        return carData;
    }

    public void setCarData(String carData) {
        this.carData = carData;
    }

    public String getCarCodSeguranca() {
        return carCodSeguranca;
    }

    public void setCarCodSeguranca(String carCodSeguranca) {
        this.carCodSeguranca = carCodSeguranca;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}