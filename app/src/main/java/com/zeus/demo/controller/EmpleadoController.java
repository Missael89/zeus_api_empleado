package com.zeus.demo.controller;

import com.zeus.demo.model.Empleado;
import com.zeus.demo.service.impl.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/zeus-demo/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @PostMapping("/create")
    private ResponseEntity<Optional<Empleado>> create(@RequestBody Empleado empleado) {
        Optional<Empleado> temp = empleadoService.save(empleado);
        try {
            return ResponseEntity.created(new URI("/api/zeus-demo/create" + temp.get().getId())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/update")
    private ResponseEntity<Optional<Empleado>> update(@RequestBody Empleado empleado) {
        Optional<Empleado> temp = empleadoService.save(empleado);
        try {
            return ResponseEntity.created(new URI("/api/zeus-demo/update" + temp.get().getId())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete (@PathVariable("id") Long id) {
        empleadoService.delete(id);
        return ResponseEntity.ok("SE ELIMINO EL EMPLEADO CON ID: " + id);
    }

    @GetMapping("/list")
    private List<Empleado> read() {
        return empleadoService.read();
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Empleado>> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(empleadoService.findById(id));
    }
}
