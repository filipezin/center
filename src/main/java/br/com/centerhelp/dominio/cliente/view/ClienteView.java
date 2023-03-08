package br.com.centerhelp.dominio.cliente.view;

import br.com.centerhelp.dominio.cliente.model.Cliente;
import org.mariadb.jdbc.client.Client;

import javax.swing.*;
import java.time.LocalDate;

public abstract class ClienteView {

    public static Cliente showForm(Cliente c){

        var tipo = TipoClienteView.select(c==null?null:c.getTipo());
        var nome = JOptionPane.showInputDialog("Nome do cliente",c==null?"":c.getNome());
        var email = JOptionPane.showInputDialog("Email do cliente", c==null?"":c.getEmail());
        var ano = 0;
        var mes = 0;
        var dia = 0;

        var dt = JOptionPane.showInputDialog("Data de Nascimento DD/MM/YYYY");
        ano = Integer.parseInt(dt.substring(6,10));
        mes = Integer.parseInt(dt.substring(3,5));
        dia = Integer.parseInt(dt.substring(0,2));

        var nascimento = LocalDate.of(ano, mes, dia);
    }

}
