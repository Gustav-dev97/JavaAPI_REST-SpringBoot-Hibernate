# Use a imagem do JDK 8 como base
FROM openjdk:8

# Copiar o arquivo JAR para o diretório esperado pelo Kaniko
COPY target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar

# Executar o aplicativo
ENTRYPOINT ["java", "-jar", "/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]
