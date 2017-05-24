[![Build Status](https://travis-ci.org/ExampleDriven/spring-boot-docker-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-boot-docker-example)
# spring-boot-docker-example

This is the source code for the blog post

https://exampledriven.wordpress.com/2016/06/24/spring-boot-docker-example/

Features :
- Maven docker plugin
- build images without dockerfile
- Docker in a multi module project
- docker-compose definition

How to run this example :

```sh
## build docker images
mvn clean install

##should display three freshly built docker images
docker images

##start up all instances
docker-compose up


```



