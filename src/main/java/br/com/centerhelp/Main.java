package br.com.centerhelp;

import br.com.centerhelp.dominio.equipamento.model.Equipamento;
import br.com.centerhelp.dominio.equipamento.view.EquipamentoView;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        var factory = Persistence.createEntityManagerFactory("maria-db");
        var manager = factory.createEntityManager();

        Equipamento e = EquipamentoView.showForm(null);

        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }
}