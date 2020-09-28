package ufms.matheus.libras.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @Column(name = "USU_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USU_NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "USU_EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "USU_SENHA", length = 20, nullable = false)
    private String senha;


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
