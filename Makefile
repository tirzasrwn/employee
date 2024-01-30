start:
	./mvnw spring-boot:run

stop:

docker_db_build:
	docker build ./db/ -t employee-mariadb
docker_db_start:
	docker run --name employee-mariadb -p 3306:3306 -v "./db/data/mariadb/:/var/lib/mysql:Z" -d employee-mariadb
	# docker run --name employee-mariadb -p 3306:3306 -d employee-mariadb
docker_db_stop:
	docker stop employee-mariadb
	docker rm employee-mariadb
