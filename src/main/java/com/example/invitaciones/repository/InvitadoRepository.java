package com.example.invitaciones.repository;

import com.example.invitaciones.entity.Invitado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitadoRepository extends JpaRepository<Invitado, Long> {
}
