CREATE DATABASE `demo` CHARACTER SET 'utf8mb4';
use mysql
update user set host='%' where user='root';

FLUSH PRIVILEGES;
