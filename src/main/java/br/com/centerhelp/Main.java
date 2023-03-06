package br.com.centerhelp;

import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        var factory = Persistence.createEntityManagerFactory("maria-db");
        var manager = factory.createEntityManager();

        /*
        Equipamento e = EquipamentoView.showForm();
        TipoEquipamento tp = new TipoEquipamento(null, "Notebook");

        manager.getTransaction().begin();
        manager.persist(tp);
        e.setTipo(tp);
        manager.persist(e);
        manager.getTransaction().commit();
        */

        manager.close();
        factory.close();
    }
}