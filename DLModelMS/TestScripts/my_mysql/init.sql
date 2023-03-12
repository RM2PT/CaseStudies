CREATE DATABASE `demo` CHARACTER SET 'utf8mb4';
use mysql
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'lemon';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;
