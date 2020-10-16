package ufms.matheus.libras.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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

    @Column(name = "USU_PESO")
    private Double peso = 1.0;
}
