# Use a imagem do Maven 3.6.0 com JDK 8 como base
FROM maven:3.6.0-jdk-8

# Copiar os arquivos do projeto para o contêiner
COPY wait-for-it.sh /usr/src/myapp

# Definir o diretório de trabalho para onde o projeto foi copiado
WORKDIR /usr/src/myapp

# Compilar o projeto e criar o arquivo JAR
RUN mvn clean package -Dmaven.test.skip=true

# Expor a porta 8080
EXPOSE 8080

# Executar o aplicativo
ENTRYPOINT ["./wait-for-it.sh", "mysqldb:3306", "--", "java", "-jar", "target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]
