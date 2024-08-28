package com.zeus.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "empleado")
@Data
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El NOMBRE no debe ser nulo")
    @NotEmpty(message = "El NOMBRE no debe estar vació")
    @NotBlank(message = "El NOMBRE no debe ser un blanco")
    private String nombre;

    @NotNull(message = "El PUESTO no debe ser nulo")
    @NotEmpty(message = "El PUESTO no debe estar vació")
    @NotBlank(message = "El PUESTO no debe ser un blanco")
    private String puesto;

    private Double salario = 0.01;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "fecha_contratacion")
    private Date fechaContratacion;
}
