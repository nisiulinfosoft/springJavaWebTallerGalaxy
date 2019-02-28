create table usuario
(
  id         INTEGER not null,
  usuario    VARCHAR2(220) not null,
  clave      VARCHAR2(220) not null,
  nombre_completo VARCHAR2(220) not null,
  estado     INTEGER default 1 not null
)

CREATE SEQUENCE SEQ_USUARIO START WITH 1 INCREMENT BY 1;


SELECT * FROM usuario;