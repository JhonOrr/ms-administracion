package com.smartlab.msadministracion.controller;

import com.smartlab.msadministracion.aggregates.dto.ClienteDto;
import com.smartlab.msadministracion.aggregates.dto.LubricanteDto;
import com.smartlab.msadministracion.aggregates.request.RequestCliente;
import com.smartlab.msadministracion.aggregates.request.RequestLubricante;
import com.smartlab.msadministracion.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @PostMapping("/crear")
    public ResponseEntity<ClienteDto> crearCliente(@RequestBody RequestCliente requestCliente,
                                                   @RequestHeader("loggedInUser") String username){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(clienteService.crearCliente(requestCliente, username));
    }
}
