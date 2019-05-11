# https://losst.ru/sozdanie-polzovatelya-mysql

CREATE SCHEMA if not exists `spring-library`;

CREATE USER if not exists 'admin'@'localhost' IDENTIFIED BY 'password';

SELECT User,Host FROM mysql.user;

GRANT ALL PRIVILEGES ON `spring-library` . * TO 'admin'@'localhost';

SHOW GRANTS FOR 'admin'@'localhost';