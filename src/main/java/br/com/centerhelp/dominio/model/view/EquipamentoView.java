package br.com.centerhelp.dominio.model.view;

import br.com.centerhelp.dominio.model.Equipamento;

import javax.swing.*;

public abstract class EquipamentoView {

    public static Equipamento showForm() {
        String nome = JOptionPane.showInputDialog("Nome");
        String numeroDeSerie = JOptionPane.showInputDialog("Número de Série");
        var equipamento = new Equipamento();
        equipamento.setNome(nome).setNumeroDeSerie(numeroDeSerie);
        return equipamento;
    }


}
