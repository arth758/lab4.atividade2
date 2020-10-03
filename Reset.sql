create schema avaliacao;

use avaliacao;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on avaliacao.* to user@'localhost';

CREATE TABLE Funcionario (
    Func_nome VARCHAR2(100),
    Func_email VARCHAR2(30),
    Func_senha VARCHAR2(30),
    Func_cargo VARCHAR(100),
    Func_salario FLOAT,
    Func_CPF_CNPJ VARCHAR2(14) PRIMARY KEY
);

CREATE TABLE Cliente (
    Cli_nome VARCHAR2(100),
    Cli_email VARCHAR2(30),
    Cli_senha VARCHAR2(30),
    Cli_CPF_CNPJ VARCHAR2(14) PRIMARY KEY
);

CREATE TABLE Cartao (
    Car_numero VARCHAR2(20) PRIMARY KEY,
    Car_nome VARCHAR2(100),
    Car_data VARCHAR(5),
    Car_cod_seguranca VARCHAR2(3),
    CPF_CNPJ VARCHAR2(14),
    FOREIGN KEY (CPF_CNPJ) REFERENCES Cliente(Cli_CPF_CNPJ)
);

CREATE TABLE Produto (
    Prod_cod VARCHAR2(10) PRIMARY KEY,
    Prod_nome VARCHAR2(40),
    Prod_marca VARCHAR2(40),
    Prod_un_medida VARCHAR2(20),
    Prod_preco NUMBER
);

CREATE TABLE Preco_Historico (
    Prod_cod VARCHAR2(10),
    Preco_data date,
    Prod_preco NUMBER,
    FOREIGN KEY (Prod_cod) REFERENCES Produto(Prod_cod),
    CONSTRAINT UK_PRECO UNIQUE(Prod_cod, Preco_data)
);

CREATE TABLE Venda (
    Cod_venda VARCHAR2(10) PRIMARY KEY,
    Valor_total_venda NUMBER,
    Forma_pgto_venda VARCHAR2(20),
    CPF_CNPJ VARCHAR2(14),
    Prod_cod VARCHAR2(10),
    FOREIGN KEY (prod_cod) REFERENCES Produto(Prod_cod),
    FOREIGN KEY (CPF_CNPJ) REFERENCES Cliente(Cli_CPF_CNPJ)
);

CREATE TABLE Historico_venda (
    Hist_data date,
    Cod_venda VARCHAR2(10),
    FOREIGN KEY (Cod_venda) REFERENCES Venda(Cod_venda),
    CONSTRAINT UK_HIST_VENDA UNIQUE(Hist_data, Cod_venda)
);

CREATE TABLE Produto_venda (
    Prod_cod VARCHAR2(10) PRIMARY KEY,
    Cod_venda VARCHAR2(10) UNIQUE,
    Quantidade_Prod NUMBER,
    FOREIGN KEY (Prod_cod) REFERENCES Produto(Prod_cod),
    FOREIGN KEY (Cod_venda) REFERENCES Venda(Cod_venda)
);

CREATE TABLE Fornecedor (
    Forn_nome VARCHAR2(100),
    Forn_categoria VARCHAR2(40),
    Forn_cod VARCHAR2(10) PRIMARY KEY
);

CREATE TABLE Produto_Fornecedor (
    Prod_cod VARCHAR2(10),
    Forn_cod VARCHAR2(10),
    FOREIGN KEY (Prod_cod) REFERENCES Produto(Prod_cod),
    FOREIGN KEY (Forn_cod) REFERENCES Fornecedor(Forn_cod),
    CONSTRAINT UK_PROD_FORN UNIQUE(Prod_cod, Forn_cod)
);