package com.smartlab.msadministracion.service;

import com.smartlab.msadministracion.aggregates.dto.ClienteDto;
import com.smartlab.msadministracion.aggregates.request.RequestCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteService {
    ClienteDto crearCliente(RequestCliente requestCliente, String username);
}
