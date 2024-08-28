package com.zeus.demo.service.impl;

import com.zeus.demo.model.Empleado;
import com.zeus.demo.repository.EmpleadoRepository;
import com.zeus.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Optional<Empleado> save(Empleado empleado) {
        Optional<Empleado> empleadoOptional = Optional.of(empleadoRepository.save(empleado));
        return empleadoOptional;
    }

    @Override
    public List<Empleado> read() {
        return empleadoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }
}
