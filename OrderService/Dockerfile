FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]

#-----------------------------------------------------------------------------------------------
# Image is sumply run and built using the following command as a single unit

# docker build -t orderservice .
# docker run -p 8082:8082 orderservice