package br.com.centerhelp.dominio.equipamento.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "TB_EQUIPAMENTO"
)
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EQUIPAMENTO")
    @SequenceGenerator(
            name = "SQ_EQUIPAMENTO",
            sequenceName = "SQ_EQUIPAMENTO",
            initialValue = 1,
            allocationSize = 20
    )
    private Long id;

    @Column(name = "NM_EQUIPAMENTO")
    private String nome;

    @Column(name = "NR_SERIE")
    private String numeroDeSerie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "ID_TP_EQUIPAMENTO",
            referencedColumnName = "ID_TP_EQUIPAMENTO",
            foreignKey = @ForeignKey(
                    name = "FK_TP_EQUIPAMENTO",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private TipoEquipamento tipo;


    public Equipamento(Long id, String nome, String numeroDeSerie, TipoEquipamento tipo) {
        this.id = id;
        this.nome = nome;
        this.numeroDeSerie = numeroDeSerie;
        this.tipo = tipo;
    }


    public TipoEquipamento getTipo() {
        return tipo;
    }

    public Equipamento setTipo(TipoEquipamento tipo) {
        this.tipo = tipo;
        return this;
    }

    public Equipamento() {
    }

    public Long getId() {
        return id;
    }

    public Equipamento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Equipamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public Equipamento setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        return this;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                '}';
    }
}
