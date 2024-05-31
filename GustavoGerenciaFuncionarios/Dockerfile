# Use a imagem do JDK 8 como base
FROM openjdk:8

# Copiar os arquivos do projeto para o contêiner
COPY . /usr/src/myapp

# Copiar o arquivo JAR para o diretório esperado pelo Kaniko
COPY target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar /kaniko/buildcontext/target/

# Definir o diretório de trabalho para onde o projeto foi copiado
WORKDIR /usr/src/myapp

# Executar o aplicativo
ENTRYPOINT ["java", "-jar", "/kaniko/buildcontext/target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]

