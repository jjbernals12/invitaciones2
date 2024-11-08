package com.example.invitaciones.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "invitado")
public class Invitado {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column
    private int invitados;

}
