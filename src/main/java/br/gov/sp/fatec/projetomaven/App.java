package br.gov.sp.fatec.projetomaven;

import javax.persistence.EntityManager;

import br.gov.sp.fatec.projetomaven.entity.PersistenceManager;

public class App 
{
    public static void main( String[] args )
    {
        EntityManager manager = PersistenceManager.getInstance().getEntityManager();

       manager.close();
    }
}
