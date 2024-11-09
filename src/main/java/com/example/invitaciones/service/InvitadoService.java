package com.example.invitaciones.service;

import com.example.invitaciones.entity.Invitado;

public interface InvitadoService {
    void saveInvitado (Invitado invitado);
    Boolean buscarInvitado(String nombre);
}
