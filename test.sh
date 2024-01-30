#!/bin/bash

# API base URL
BASE_URL="http://localhost:8080/api/employees"

# Read All (GET)
read_all() {
	curl "$BASE_URL"
}
# Create (POST)
create() {
	curl -X POST -H "Content-Type: application/json" -d '{
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com"
    }' "$BASE_URL"
}

# Read (GET)
read_employee() {
	curl "$BASE_URL/$1"
}

# Update (PUT)
update() {
	curl -X PUT -H "Content-Type: application/json" -d '{
        "id": 1,
        "firstName": "UpdatedFirstName",
        "lastName": "UpdatedLastName",
        "email": "updated.email@example.com"
    }' "$BASE_URL/$1"
}

# Delete (DELETE)
delete() {
	curl -X DELETE "$BASE_URL/$1"
}

# Main script
case "$1" in
c | create)
	create
	;;
r | read)
	read_employee "$2"
	;;
ra | read_all)
	read_all
	;;
u | update)
	update "$2"
	;;
d | delete)
	delete "$2"
	;;
*)
	echo "Usage: $0 {c|create|r|read|u|update|d|delete|ra|read_all} [id]"
	exit 1
	;;
esac
