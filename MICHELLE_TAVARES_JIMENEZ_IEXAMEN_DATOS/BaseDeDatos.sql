CREATE DATABASE michelle_examen;

#Los conciertos tienen un artista asociado, costo del evento, fecha, capacidad máxima de personas y lugar.

USE michelle_examen;

create user 'usuario'@'%' identified by 'contrasena';

grant all privileges on michelle_examen.* to 'usuario'@'%';

flush privileges;

# en caso de error
DROP USER 'usuario'@'%';

CREATE Table conciertos (
    id_concierto int AUTO_INCREMENT,
    nombre_artista varchar(50),
    costo_entrada int,
    fecha_concierto varchar(50),
    capacidad_maxima int,
    lugar varchar(50),
    PRIMARY KEY (id_concierto)
    );

INSERT INTO conciertos (nombre_artista, costo_entrada, fecha_concierto, capacidad_maxima, lugar) VALUES ('Metallica', '100', '2020-01-01', '100', 'Estadio Metropolitano');
  

