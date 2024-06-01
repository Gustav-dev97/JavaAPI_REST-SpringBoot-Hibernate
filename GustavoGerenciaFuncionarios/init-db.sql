CREATE DATABASE IF NOT EXISTS crudapi;
USE crudapi;

CREATE TABLE tbl_funcionario
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    genero VARCHAR(255),
    departamento VARCHAR(255),
    nascimento DATE
);
