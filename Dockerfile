
FROM openjdk:17-oracle

WORKDIR app
EXPOSE 8080

COPY . .

ARG JAR_FILE=target/*.jar

RUN ./mvnw package
RUN mv ${JAR_FILE} app.jar



ENTRYPOINT ["java", "-jar", "app.jar"]
