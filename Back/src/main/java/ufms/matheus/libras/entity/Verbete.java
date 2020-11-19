package ufms.matheus.libras.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.File;

@Getter
@Setter
@Entity
@Table(name = "TB_VER")
public class Verbete {

    @Id
    @Column(name = "VER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USU_ID", nullable = false)
    private Usuario usuario;

    @Column(name = "VER_TITULO", nullable = false)
    private String titulo;

    @Column(name = "VER_DESCRI", nullable = false)
    private String descricao;

    @Column(name = "VER_TITULOLI", nullable = false)
    private String tituloLibras;

    @Column(name = "VER_DESCRILI", nullable = false)
    private String descricaoLibras;

    @Column(name = "VER_RANK")
    private Double rank;
}
