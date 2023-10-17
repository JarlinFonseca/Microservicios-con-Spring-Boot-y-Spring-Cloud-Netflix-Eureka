INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$aa2gTArQdS.cwidIqZsbRuqUYQrtJMFsRICIaIwVAL1UNZUwlr/eO',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$cPRQs40u9g7u7oOCzH99IuhoJYsCtWRlYWs2xRgocXgL/HXrzBi8a',1, 'John', 'Doe','jhon.doe@bolsadeideas.com');


INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2, 1);