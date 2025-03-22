FROM openjdk:17
EXPOSE 8080
ADD target/bookservice-docker-file.jar bookservice-docker-file.jar
ENTRYPOINT [ "java","-jar","/bookservice-docker-file.jar" ]