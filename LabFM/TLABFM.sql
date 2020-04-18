CREATE DATABASE labFm;
USE labFm;

CREATE TABLE CLIENTES
(
ID int(20) auto_increment ,
CodigoCliente VARCHAR (10),
NombreCliente VARCHAR (50),
DpiCliente VARCHAR (50),
DireccionCliente VARCHAR (50),
TelefonoCliente VARCHAR (10),
CorreoCliente VARCHAR (30),
EstatusCliente VARCHAR (10), 
PRIMARY KEY (CodigoCliente)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE PELICULAS
(
ID int(20) auto_increment,
CodigoPelicula  VARCHAR (10),
NombrePelicula VARCHAR (50),
AutorPelicula VARCHAR (50),
TipoPelicula VARCHAR (10),
ExistenciaPelicula VARCHAR (20),
EstatusPelicula VARCHAR (10),
PRIMARY KEY (CodigoPelicula)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE VIDEOJUEGOS
(
ID int(20) auto_increment,
CodigoVideoJ  VARCHAR (10),
NombreVideoJ VARCHAR (50),
ConsolaVideoJ VARCHAR (50),
TipoVideoJ VARCHAR (10),
ExistenciaVideoJ VARCHAR (20),
EstatusVideoJ VARCHAR (10),
PRIMARY KEY (CodigoVideoJ)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE FVENCIDA
(
ID int(20) auto_increment,
CodigoDevVencida VARCHAR (10), 
CodigoCliente VARCHAR (10),
CodigoPelicula VARCHAR (10),
CodigoVideoJ VARCHAR (10),
FechaRenta VARCHAR (10),
FechaDevolucion VARCHAR (10),
FechaVencida VARCHAR (10),
PagoImporte VARCHAR (10),
PRIMARY KEY (CodigoDevVencida),
KEY (ID)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

USE labFm;
Select * From CLIENTES;

USE labFm;
Select * From PELICULAS;

USE labFm;
Select * From VIDEOJUEGOS;

USE labFm;
Select * From FVENCIDA;