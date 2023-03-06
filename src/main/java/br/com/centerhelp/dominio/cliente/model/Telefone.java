package br.com.centerhelp.dominio.cliente.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Telefone {

    @Column(name = "DDI_TELEFONE", length = 4)
    private String ddi;

    @Column(name = "DDD_TELEFONE", length = 3)
    private String ddd;

    @Column(name = "NR_TELEFONE", length = 20)
    private String numero;

}
