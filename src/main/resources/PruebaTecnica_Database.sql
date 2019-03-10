create database cursos_schema;

use cursos_schema;

create table Profesores(
	id_profesor INT (5),
	nombre VARCHAR(50) NOT NULL,
	apellidos VARCHAR(150) NOT NULL
);

ALTER TABLE Profesores 
ADD PRIMARY KEY (id_profesor);

ALTER TABLE Profesores
MODIFY id_profesor INT(5) NOT NULL AUTO_INCREMENT;

create table Cursos(
	id_curso INT(5),
	titulo VARCHAR(250) NOT NULL,
	nivel VARCHAR(30) NOT NULL,
	num_horas INT NOT NULL,
	activo BOOLEAN,
	id_profesor INT
);

ALTER TABLE Cursos
ADD PRIMARY KEY (id_curso);

ALTER TABLE Cursos
MODIFY id_curso INT(5) NOT NULL AUTO_INCREMENT;

ALTER TABLE Cursos
Add FOREIGN KEY (id_profesor) REFERENCES Profesores(id_profesor);