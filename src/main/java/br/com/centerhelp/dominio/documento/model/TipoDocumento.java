package br.com.centerhelp.dominio.documento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_TP_DOCUMENTO")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TP_DOCUMENTO")
    @SequenceGenerator(name = "SQ_TP_DOCUMENTO", sequenceName = "SQ_TP_DOCUMENTO")
    @Column(name = "ID_TP_DOCUMENTO")
    private Long id;

    @Column(name = "NM_TP_DOCUMENTO")
    private String nome;
}
