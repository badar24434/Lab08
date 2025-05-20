-- Password mapping for testing:
-- admin@gmail.com - password: admin
-- test@gmail.com - password: test
-- abc@gmail.com - password: abc
-- def@gmail.com - password: def


INSERT INTO users(email, name, password) VALUES
    ('admin@gmail.com','admin','admin');
INSERT INTO users(email, name, password) VALUES
    ('test@gmail.com','John','test');
INSERT INTO users(email, name, password) VALUES
    ('abc@gmail.com','Alex','abc');
INSERT INTO users(email, name, password) VALUES
    ('def@gmail.com','Boss','def');
INSERT INTO roles(name) VALUES ('ROLE_ADMIN');
INSERT INTO roles(name) VALUES ('ROLE_USER');
INSERT INTO users_roles(role_id, user_id) VALUES (1,1);
INSERT INTO users_roles(role_id, user_id) VALUES (2,2);
INSERT INTO users_roles(role_id, user_id) VALUES (2,3);
INSERT INTO users_roles(role_id, user_id) VALUES (2,4);
INSERT INTO users_roles(role_id, user_id) VALUES (1,4);
