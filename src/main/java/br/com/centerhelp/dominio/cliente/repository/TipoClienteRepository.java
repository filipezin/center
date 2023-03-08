package br.com.centerhelp.dominio.cliente.repository;

import br.com.centerhelp.abstracoes.Repository;
import br.com.centerhelp.dominio.cliente.model.TipoCliente;

import java.util.Collection;
import java.util.List;

public abstract class TipoClienteRepository extends Repository {

    public static TipoCliente findById(Long id){
        return manager.find(TipoCliente.class, id);
    }


    public static TipoCliente save(TipoCliente tp){
        manager.getTransaction().begin();
        manager.persist(tp);
        manager.getTransaction().commit();
        return tp;
    }

    public static List<?> findAll(){
        String jpql = "from TipoCliente";
        return manager.createQuery(jpql).getResultList();
    }
}


