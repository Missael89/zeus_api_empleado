-- CREAR LA BASE DE DATOS --
CREATE DATABASE zeus_demo;

-- CREAR TABLA DE EMPLEADO --
CREATE TABLE empleado (
	`id` BIGINT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(255) NOT NULL,
	puesto VARCHAR(255) NOT NULL,
	salario DECIMAL(6,2) NOT NULL,
	fecha_contratacion DATE NULL
);