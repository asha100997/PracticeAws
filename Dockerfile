FROM eclipse-temurin:17
COPY target/webaws.jar webaws.jar
CMD ["java","-jar","webaws.jar"]