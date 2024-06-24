FROM openjdk:latest
WORKDIR salaf
COPY . .
CMD ["java", "Pratica_POO/Pratica_POO.iml"]