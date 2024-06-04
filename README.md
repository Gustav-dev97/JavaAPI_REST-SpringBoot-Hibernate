# API_REST_gerenciamentoDeFuncionarios-SpringBoot-Hibernate
API REST para gerenciamento de funcionários utilizando SpringBoot e Hibernate:

Esta API REST de demonstração tem como objetivo auxiliar o gerênciamento de funcionários, foi desenvolvido usando SpringBoot 
para interação com a API REST ele também demonstra como conectar-se com o MySQL utilizando o Hibernate, também foram utilizados
algumas dependências do JPA.

  As dependências foram geradas usando o link abaixo:
  
      https://start.spring.io/
      
 Foram selecionados:
 
      Spring Web
      
      Spring Boot DevTools
      
      MySQL Driver
      
      Spring Data JPA

-----------------------------------------------------------------------------------------------------------------------------

ANTES de realizar o primeiro uso execute o arquivo abaixo para criar o banco de dados e suas tabelas

	    CriarDbTbl.sql
    
IMPORTANTE: A API irá se conectar-se com o banco de dados MySql utilizando usuário "root" e  senha "null", 
mas caso tenha alterado seu nome de usuário e/ou senha no MySql deverá também alterá-la dentro do aquivo "application.properties"
presente no diretório: /src/main/resources/application.properties, caso ao contrário a API não irá conseguirá conectar-se com o 
banco de dados.

-----------------------------------------------------------------------------------------------------------------------------
Você pode abrir o projeto em sua IDE, gerar e executar o arquivo .jar <GustavoGerenciaFuncionarios-0.0.1-SNAPSHOT> ou executar o comando
abaixo caso prefira

     mvn spring-boot:run
    
-----------------------------------------------------------------------------------------------------------------------------

A API utiliza a o localhost porta 8080 (HTTP & HTTPS) e realiza as funções CRUD, você poderá usar o rest client de sua preferência (como o
Postman ou Curl por exemplo).

Para interagir com a API:

Cadastrar funcionário:

    POST 
    localhost:8080/api/funcionario/
    
Atualizar dados:

    PUT 
    localhost:8080/api/funcionario/    

Retornar lista de funcionários:

    GET 
    localhost:8080/api/funcionario/

Retornar um funcionário pelo ID:

    GET 
    localhost:8080/api/funcionario/{id}

Deletar do banco de dados:

    DELETE 
    localhost:8080/api/funcionario/{id}

-----------------------------------------------------------------------------------------------------------------------------

Para iniciar o container: 

	cd JavaAPI_REST-SpringBoot-Hibernate-main/JavaAPI_REST-SpringBoot-Hibernate-main/GustavoGerenciaFuncionarios
	docker-compose up
    
-----------------------------------------------------------------------------------------------------------------------------

Se precisar entrar em contato comigo pode me encontrar pelos meios de comunicação abaixo:

	e-Mail: gustavo.dev97@gmail.com
	GitHub: github.com/Gustav-dev97

Muito Obrigado!
