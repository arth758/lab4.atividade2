package br.gov.sp.fatec.projetomaven.dao;

import javax.persistence.EntityManager;

import br.gov.sp.fatec.projetomaven.entity.PersistenceManager;
import br.gov.sp.fatec.projetomaven.entity.Produto;

public class ProdutoDaoJpa implements ProdutoDao {

    private EntityManager em;

    public ProdutoDaoJpa() {
        this(PersistenceManager.getInstance().getEntityManager());
    }

    public ProdutoDaoJpa(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    public Produto cadastrarProduto(String prodNome, String prodMarca, String unMedida, Double prodPreco) {
        Produto produto = new Produto();
        produto.setProdNome(prodNome);
        produto.setProdMarca(prodMarca);
        produto.setProdUnMedida(unMedida);
        produto.setProdPreco(prodPreco);
        return null;
    }

    @Override
    public Produto salvarProduto(Produto produto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto salvarProdutoSemCommit(Produto produto) {
        // TODO Auto-generated method stub
        return null;
    }
    
}