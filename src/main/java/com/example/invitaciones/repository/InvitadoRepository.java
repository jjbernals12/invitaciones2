package com.example.invitaciones.repository;

import com.example.invitaciones.entity.Invitado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvitadoRepository extends JpaRepository<Invitado, Long> {
    public Optional<Invitado> findByNombre(String nombre);

}
