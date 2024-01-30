FROM mariadb:10.11.6-jammy AS production
ENV MARIADB_ROOT_PASSWORD mariadb
COPY ./data/employee.sql docker-entrypoint-initdb.d/employee.sql

