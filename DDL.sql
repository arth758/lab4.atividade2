drop database avaliacao;

create schema avaliacao;

use avaliacao;

-- create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on avaliacao.* to user@'localhost';

CREATE TABLE Funcionario (
    Func_nome VARCHAR(100),
    Func_email VARCHAR(30),
    Func_senha VARCHAR(30),
    Func_cargo VARCHAR(100),
    Func_salario FLOAT,
    Func_CPF_CNPJ VARCHAR(14) PRIMARY KEY
);

CREATE TABLE Cliente (
    Cli_nome VARCHAR(100),
    Cli_email VARCHAR(30),
    Cli_senha VARCHAR(30),
    Cli_CPF_CNPJ VARCHAR(14) PRIMARY KEY
);

CREATE TABLE Cartao (
    Car_numero VARCHAR(20) PRIMARY KEY,
    Car_nome VARCHAR(100),
    Car_data VARCHAR(5),
    Car_cod_seguranca VARCHAR(3),
    CPF_CNPJ VARCHAR(14),
    FOREIGN KEY (CPF_CNPJ) REFERENCES Cliente(Cli_CPF_CNPJ)
);

CREATE TABLE Produto (
    Prod_cod NUMBER PRIMARY KEY,
    Prod_nome VARCHAR(40),
    Prod_marca VARCHAR(40),
    Prod_un_medida VARCHAR(20),
    Prod_preco INT
);

CREATE TABLE Venda (
    Cod_venda NUMBER PRIMARY KEY,
    Valor_total_venda NUMBER,
    Forma_pgto_venda VARCHAR(20),
    CPF_CNPJ VARCHAR(14),
    Prod_cod VARCHAR(10),
    FOREIGN KEY (prod_cod) REFERENCES Produto(Prod_cod),
    FOREIGN KEY (CPF_CNPJ) REFERENCES Cliente(Cli_CPF_CNPJ)
);

CREATE TABLE Produto_venda (
    Prod_cod NUMBER,
    Cod_venda NUMBER,
    Quantidade_Prod INT,
    FOREIGN KEY (Prod_cod) REFERENCES Produto(Prod_cod),
    FOREIGN KEY (Cod_venda) REFERENCES Venda(Cod_venda)
);

CREATE TABLE Fornecedor (
    Forn_nome VARCHAR(100),
    Forn_categoria VARCHAR(40),
    Forn_cod NUMBER PRIMARY KEY,
    Endereco_id NUMBER,
    FOREIGN KEY (Endereco_id) REFERENCES Endereco(end_id)
);

CREATE TABLE Produto_Fornecedor (
    Prod_cod NUMBER,
    Forn_cod NUMBER,
    FOREIGN KEY (Prod_cod) REFERENCES Produto(Prod_cod),
    FOREIGN KEY (Forn_cod) REFERENCES Fornecedor(Forn_cod),
    CONSTRAINT UK_PROD_FORN UNIQUE(Prod_cod, Forn_cod)
);

CREATE TABLE Endereco (
    end_id NUMBER,
    end_logradouro VARCHAR(100),
    end_numero VARCHAR(50),
    end_bairro VARCHAR(30),
    end_cep VARCHAR(9),
    end_cidade VARCHAR(30),
    end_cmpl VARCHAR(40)
);
