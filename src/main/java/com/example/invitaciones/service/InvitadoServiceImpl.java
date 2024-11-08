package com.example.invitaciones.service;

import com.example.invitaciones.entity.Invitado;
import com.example.invitaciones.repository.InvitadoRepository;
import org.springframework.stereotype.Service;

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
}
