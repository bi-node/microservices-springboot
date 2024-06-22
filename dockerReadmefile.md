docker run --name micro-container -p 5430:5432 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=main_db -d postgres:13

docker logs -f micro-container



docker exec -it micro-container psql -U user -d main_db -c "CREATE DATABASE students;"

docker exec -it micro-container psql -U user -d main_db -c "CREATE DATABASE school;"
docker exec -it micro-container psql -U user -d main_db


zipkin:
container_name: zipkin
image: openzipkin/zipkin
ports:
 -"9411:9411"
networks: 
zipkin
