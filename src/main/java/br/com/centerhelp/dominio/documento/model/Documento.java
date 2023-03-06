package br.com.centerhelp.dominio.documento.model;

import br.com.centerhelp.dominio.cliente.model.Cliente;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_DOCUMENTO")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DOCUMENTO")
    @SequenceGenerator(
            name = "SQ_DOCUMENTO",
            sequenceName = "SQ_DOCUMENTO"
    )
    @Column(name = "ID_DOCUMENTO")
    private Long id;

    @Column(name = "NR_DOCUMENTO")
    private String numero;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "ID_TP_DOCUMENTO",
            referencedColumnName = "ID_TP_DOCUMENTO",
            foreignKey = @ForeignKey(
                    name = "FK_TP_DOCUMENTO",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private TipoDocumento tipo;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name =  "ID_CLIENTE",
            referencedColumnName =  "ID_CLIENTE",
            foreignKey = @ForeignKey(
                    name = "FK_DOC_CLIENTE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Cliente cliente;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_EMISSAO")
    private LocalDate emissao;

}
