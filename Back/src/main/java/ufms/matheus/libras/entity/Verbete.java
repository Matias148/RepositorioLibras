package ufms.matheus.libras.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "TB_VER")
public class Verbete {

    @Id
    @Column(name = "VER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "USU_ID", nullable = false)
//    private Usuario usuario;

    @Column(name = "VER_TITULO", nullable = false)
    private String titulo;

    @Column(name = "VER_DESCRI", nullable = false, length = 1000)
    private String descricao;

    @Column(name = "VER_TITULOLI", nullable = false, columnDefinition = "NVARCHAR(MAX)")
    private String tituloLibras;

    @Column(name = "VER_DESCRILI", columnDefinition = "NVARCHAR(MAX)")
    private String descricaoLibras;

    @Column(name = "VER_CONFIGMAO")
    private String configuracaoMao;

    @Column(name = "VER_PONTOARTI")
    private String pontoArticulacao;

    @Column(name = "VER_DIRECAOPALMA")
    private String direcaoPalma;

    @Column(name = "VER_RANK")
    private Double rank;
}
