FROM openjdk:8

COPY target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]