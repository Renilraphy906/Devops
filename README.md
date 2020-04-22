# Devops
Devops project and tutorials

##Aim

This projects is to demostrate how to automate a Spring Boot and mySql project using docker

##Project Structure

Docker-compose-Demo

--> src
--> springboot+mysql_backend
-- --> pom.xml
-- --> src
-- -- --> main
-- -- -- --> java
-- -- -- --> resources
--> infra
-- --> docker
-- -- --> docker-compose.yml
-- -- --> services
-- -- -- --> springboot+mysql_backend
-- -- -- -- --> Dockerfile

##Prerequests

Docker installed in host machine

##How to run

* clone the git repository
* go to folder infra/Docker
* enter command in cmd > docker-compose up

##uri's

1) http://13.234.72.27:8001/docker_demo/hello
2) http://13.234.72.27:8001/docker_demo/add/name=[enter name]
3) http://13.234.72.27:8001/docker_demo/findall
