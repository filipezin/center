package br.com.centerhelp.dominio.model;


import jakarta.persistence.*;

@Entity
@Table(name = "TB_TP_EQUIPAMENTO")
public class TipoEquipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TP_EQUIPAMENTO")
    @SequenceGenerator(name = "SQ_TP_EQUIPAMENTO", sequenceName = "SQ_TP_EQUIPAMENTO", initialValue = 1, allocationSize = 20)
    @Column(name = "ID_TP_EQUIPAMENTO")
    private Long id;

    @Column(name = "NM_TP_EQUIPAMENTO")
    private String nome;

    public TipoEquipamento() {
    }

    public TipoEquipamento(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TipoEquipamento{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
