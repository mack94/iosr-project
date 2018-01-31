cd iosr-loadbalancer
mvn package
cd ../iosr-project
mvn package
cd ../iosr-server
mvn package
cd ../iosr-manipulation-service
mvn package
cd ..
docker-compose up -d
