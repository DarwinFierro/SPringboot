package com.pruebaJavaSpring.prueba.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "auditoria")
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "auditor", length = 30)
    private String auditor;

    @Getter @Setter @Column(name = "ente_control", length = 30)
    private String ente_control;

    @Getter @Setter @Column(name = "estado", columnDefinition = "int(1) default '0'")
    private String estado;

    @Getter @Setter @Column(name = "fecha_inicio", columnDefinition= "date")
    private String fecha_inicio;

    @Getter @Setter @Column(name = "fecha_fin", columnDefinition= "date")
    private String fecha_fin;
}
