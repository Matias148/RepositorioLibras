package ufms.matheus.libras.entity;


import javax.persistence.*;

@Entity
@Table(name = "TB_AMI")
public class Amizade {

    @Id
    @Column(name = "AMI_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USU_ID_USUARIO", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "USU_ID_AMIGO", nullable = false)
    private Usuario amigo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getAmigo() {
        return amigo;
    }
    public void setAmigo(Usuario amigo) {
        this.amigo = amigo;
    }
}
