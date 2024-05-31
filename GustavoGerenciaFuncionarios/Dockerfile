# Use a imagem do JDK 8 como base
FROM maven:3.6.0-jdk-8

# Copiar os arquivos do projeto para o contêiner
COPY . /usr/src/myapp

# Definir o diretório de trabalho para onde o projeto foi copiado
WORKDIR /usr/src/myapp

# Compilar o projeto e criar o arquivo JAR
RUN mvn clean package -Dmaven.test.skip=true

# Executar o aplicativo
ENTRYPOINT ["java", "-jar", "target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]
