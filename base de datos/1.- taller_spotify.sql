DROP TABLE cancion;

CREATE TABLE cancion (
    id_cancion          NUMBER GENERATED AS IDENTITY PRIMARY KEY,
    titulo              VARCHAR2(200),
    artista             VARCHAR2(100),
    album               VARCHAR2(200),
    genero              VARCHAR2(100),
    duracion_segundos   NUMBER,
    fecha_lanzamiento   DATE
);

INSERT INTO cancion (titulo,artista,album,genero,duracion_segundos,fecha_lanzamiento) VALUES ('YOUtopia','Bring me the Horizon','POST HUMAN: NeX GEN','Metalcore',243,DATE '2024-05-24');

INSERT INTO cancion (titulo,artista,album,genero,duracion_segundos,fecha_lanzamiento) VALUES ('Kool-Aid','Bring me the Horizon','POST HUMAN: NeX GEN','Metalcore',229,DATE '2024-05-24');

INSERT INTO cancion (titulo,artista,album,genero,duracion_segundos,fecha_lanzamiento) VALUES ('DArkSide','Bring me the Horizon','POST HUMAN: NeX GEN','Metalcore',166,DATE '2024-05-24');

COMMIT;