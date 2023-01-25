

/* Creamos algunos usuarios con sus roles */
INSERT INTO `users` (username, password, enabled, nombre, apellido, email) VALUES ('emaravi','$2a$10$QaHDul4nLH7fG0ZHApxXcOV34FqaaoU1I9oXnseeQmd2wI62G5pBm',1,'Emanuel', 'Portal','epo@gmail.com');

INSERT INTO `users` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$Q.EgVa2HvZ9R7EewaapMEugwPB7AKZqwF9D5QdVKO2c08srxk48Yi',1,'Priscila', 'Chavez','pchav@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');


INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2, 1);
