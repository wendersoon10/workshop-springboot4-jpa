Workshop Spring Boot 4 JPA

Projeto de exemplo em Java usando Spring Boot 4 e JPA para CRUD e persistência de dados.

Tecnologias

Java 17+, Spring Boot 4, Spring Web, Spring Data JPA, H2 (banco em memória), Maven

Estrutura

controller/ → endpoints REST
service/ → regras de negócio
repository/ → interfaces JPA
model/ → entidades
resources/application.properties → configuração do banco

Como rodar
git clone https://github.com/wendersoon10/workshop-springboot4-jpa.git
Abrir no IDE
Configurar banco se quiser (MySQL/PostgreSQL)
mvn spring-boot:run
Testar endpoints via Postman ou navegador
