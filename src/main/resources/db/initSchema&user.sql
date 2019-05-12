# https://losst.ru/sozdanie-polzovatelya-mysql

CREATE SCHEMA if not exists `spring_library`;

CREATE USER if not exists 'admin'@'localhost' IDENTIFIED BY 'password';

SELECT User,Host FROM mysql.user;

GRANT ALL PRIVILEGES ON `spring_library` . * TO 'admin'@'localhost';

SHOW GRANTS FOR 'admin'@'localhost';

# D:\mysql\bin>mysqldump.exe -u admin -p spring-library > d:\database.db
# D:\mysql\bin>mysql.exe -u admin -p spring_library < d:\database.db
#
# D:\mysql\bin>mysql -u admin -p
# mysql> drop schema `spring-library`;
# mysql> exit
# D:\mysql\bin>del d:\database.db

