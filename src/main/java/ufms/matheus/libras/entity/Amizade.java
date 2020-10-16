package ufms.matheus.libras.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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
}
