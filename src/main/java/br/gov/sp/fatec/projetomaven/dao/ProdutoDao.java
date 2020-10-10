package br.gov.sp.fatec.projetomaven.dao;

import br.gov.sp.fatec.projetomaven.entity.Produto;

public interface ProdutoDao {
    public Produto cadastrarProduto(String prodNome, String prodMarca, String unMedida, Double prodPreco);

    public Produto salvarProduto(Produto produto);

    public Produto salvarProdutoSemCommit(Produto produto);
}