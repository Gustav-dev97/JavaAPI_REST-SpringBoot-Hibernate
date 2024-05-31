# Use a imagem do JDK 8 como base
FROM maven:3.9.7-jdk-8

# Copiar os arquivos do projeto para o contêiner
COPY . /usr/src/myapp

# Definir o diretório de trabalho para onde o projeto foi copiado
WORKDIR /usr/src/myapp

# Compilar o projeto e criar o arquivo JAR com saída de depuração
RUN mvn clean package

# Listar os arquivos no diretório target/ após a tentativa de construção do JAR.
RUN ls -la /usr/src/myapp/target/

# Executar o aplicativo
ENTRYPOINT ["java", "-jar", "target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]
