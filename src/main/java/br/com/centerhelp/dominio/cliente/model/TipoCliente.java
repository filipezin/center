package br.com.centerhelp.dominio.cliente.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_TP_CLIENTE")
public class TipoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TP_CLIENTE")
    @SequenceGenerator(name = "SQ_TP_CLIENTE", sequenceName = "SQ_TP_CLIENTE")
    @Column(name = "ID_TP_CLIENTE")
    private Long id;

    @Column(name = "NM_TP_CLIENTE")
    private String nome;

}
