# Use a imagem do Maven 3.6.0 com JDK 8 como base
FROM maven:3.6.0-jdk-8

# Copiar os arquivos do projeto e o script wait-for-it.sh para o contêiner
COPY . /usr/src/myapp
COPY wait-for-it.sh /usr/src/myapp

# Dar permissão de execução para o script
RUN chmod +x /usr/src/myapp/wait-for-it.sh

# Definir o diretório de trabalho para onde o projeto foi copiado
WORKDIR /usr/src/myapp

# Compilar o projeto e criar o arquivo JAR
RUN mvn clean package -Dmaven.test.skip=true

# Expor a porta 8080
EXPOSE 8080

# Executar o aplicativo
ENTRYPOINT ["/usr/src/myapp/wait-for-it.sh", "mysqldb:3306", "--timeout=30", "--strict", "--", "java", "-jar", "target/GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT.jar"]
