FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/skeleton-react-spring.jar
COPY ${JAR_FILE} skeleton-react-spring.jar
ENTRYPOINT ["java","-jar","/skeleton-react-spring.jar"]
EXPOSE 8080
EXPOSE 8443
