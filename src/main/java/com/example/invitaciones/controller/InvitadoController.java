package com.example.invitaciones.controller;

import com.example.invitaciones.entity.Invitado;
import com.example.invitaciones.service.InvitadoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invitado")
public class InvitadoController {

    private final InvitadoServiceImpl invitadoService;

    public InvitadoController(InvitadoServiceImpl invitadoService) {
        this.invitadoService = invitadoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createInvitacion(@RequestBody Invitado invitado){ invitadoService.saveInvitado(invitado); }
}
