FROM mysql:8.0.23

# FROM centos

MAINTAINER lemon
ENV MYSQL_ROOT_PASSWORD=lemon

# COPY init.sql /docker-entrypoint-initdb.d/

COPY maven/init.sql / /docker-entrypoint-initdb.d/

EXPOSE 3306
