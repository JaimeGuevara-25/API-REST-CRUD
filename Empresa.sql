CREATE DATABASE Empresa;
USE Empresa;

CREATE TABLE EMPRESA(
	idEmpresa INT auto_increment PRIMARY KEY,
    nombre VARCHAR(100) not null,
    nit VARCHAR(15) not null,
    fecha VARCHAR(20) not null,
    direccion VARCHAR(50)
);

	SELECT * FROM Empresa

DROP table Empresa
