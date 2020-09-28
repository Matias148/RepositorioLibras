package ufms.matheus.libras.entity;

import javax.persistence.*;
import java.io.File;

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


    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTituloLibras() {
        return tituloLibras;
    }

    public void setTituloLibras(String tituloLibras) {
        this.tituloLibras = tituloLibras;
    }

    public String getDescricaoLibras() {
        return descricaoLibras;
    }

    public void setDescricaoLibras(String descricaoLibras) {
        this.descricaoLibras = descricaoLibras;
    }
}
