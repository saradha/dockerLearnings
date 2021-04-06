FROM adoptopenjdk/openjdk11
WORKDIR /app
COPY /target/*.jar /app/docker-demo.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","docker-demo.jar"]
