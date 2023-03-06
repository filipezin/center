package br.com.centerhelp.dominio.cliente.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLIENTE")
    @SequenceGenerator(name = "SQ_CLIENTE", sequenceName = "SQ_CLIENTE")
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NM_CLIENTE")
    private String nome;

    @Column(name = "EMAIL_CLIENTE")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_NASCIMENTO")
    private LocalDate nascimento;
    @Embedded
    private Telefone telefone;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "ID_TP_CLIENTE",
            referencedColumnName = "ID_TP_CLIENTE",
            foreignKey = @ForeignKey(
                    name = "FK_TP_CLIENTE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private TipoCliente tipo;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nascimento=").append(nascimento);
        sb.append(", telefone=").append(telefone);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
