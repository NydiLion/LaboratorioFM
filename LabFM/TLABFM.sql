CREATE DATABASE labFm;
USE labFm;
CREATE TABLE CLIENTES
(
ID int(20) auto_increment PRIMARY KEY,
CodigoCliente VARCHAR (10) NOT NULL,
NombreCliente VARCHAR (50) NOT NULL,
DpiCliente VARCHAR (50) NOT NULL,
DireccionCliente VARCHAR (50) NOT NULL,
TelefonoCliente VARCHAR (10) NOT NULL,
CorreoCliente VARCHAR (30) NOT NULL,
EstatusCliente VARCHAR (10) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE PELICULAS
(
ID int(20) auto_increment PRIMARY KEY,
CodigoPelicula  VARCHAR (10) NOT NULL,
NombrePelicula VARCHAR (50) NOT NULL,
AutorPelicula VARCHAR (50) NOT NULL,
TipoPelicula VARCHAR (10) NOT NULL,
ExistenciaPelicula VARCHAR (20) NOT NULL,
EstatusPelicula VARCHAR (10) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;
CREATE TABLE VIDEOJUEGOS
(
ID int(20) auto_increment PRIMARY KEY,
CodigoVideoJ  VARCHAR (10) NOT NULL,
NombreVideoJ VARCHAR (50) NOT NULL,
ConsolaVideoJ VARCHAR (50) NOT NULL,
TipoVideoJ VARCHAR (10) NOT NULL,
ExistenciaVideoJ VARCHAR (20) NOT NULL,
EstatusVideoJ VARCHAR (10) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE RENTAVENCIDA
(
CodigoCliente VARCHAR (10),
CodigoPelicula VARCHAR (10),
CodigoVideoJ VARCHAR (10), 
FechaRenta DATE,
FechaDevolucion DATE,
FechaVencida DATE,
ValorVencido FLOAT(10,2),
PagoCores FLOAT(10,2),
PRIMARY KEY (CodigoCliente, CodigoPelicula, CodigoVideoJ),
FOREIGN KEY (CodigoCliente) REFERENCES CLIENTES (CodigoClientes),
FOREIGN KEY (CodigoPelicula) REFERENCES PELICULAS (CodigoPelicula),
FOREIGN KEY (CodigoVideoJ) REFERENCES VIDEOJUEGOS (CodigoVideoJ)
) ENGINE=INNODB DEFAULT CHARSET=latin1;
USE labFm;
Select * From PELICULAS;

