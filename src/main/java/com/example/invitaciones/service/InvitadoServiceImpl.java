package com.example.invitaciones.service;

import com.example.invitaciones.entity.Invitado;
import com.example.invitaciones.repository.InvitadoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvitadoServiceImpl implements InvitadoService{

    private final InvitadoRepository invitadoRepository;

    public InvitadoServiceImpl(InvitadoRepository invitadoRepository) {
        this.invitadoRepository = invitadoRepository;
    }

    @Override
    public void saveInvitado(Invitado invitado) {
        invitadoRepository.save(invitado);
    }

    @Override
    public Boolean buscarInvitado(String nombre) {
        Optional<Invitado> invitado = invitadoRepository.findByNombre(nombre);
        return invitado.isPresent();
    }

}
