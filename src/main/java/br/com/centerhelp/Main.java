package br.com.centerhelp;

import br.com.centerhelp.dominio.model.Equipamento;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        var factory = Persistence.createEntityManagerFactory("oracle");

        var manager = factory.createEntityManager();

        Equipamento e = new Equipamento();
        e.setNome("Monitor DELL").setNumeroDeSerie("12345646");

        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();
    }
}