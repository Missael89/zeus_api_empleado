package com.zeus.demo.service;

import com.zeus.demo.model.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    Optional<Empleado> save(Empleado empleado);
    List<Empleado> read();
    void delete(Long id);
    Optional<Empleado> findById(Long id);
}
