package br.com.centerhelp;

import br.com.centerhelp.dominio.equipamento.model.Equipamento;
import br.com.centerhelp.dominio.equipamento.model.TipoEquipamento;
import br.com.centerhelp.dominio.equipamento.view.EquipamentoView;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        var factory = Persistence.createEntityManagerFactory("oracle");
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
    }
}