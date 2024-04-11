
## Objetivos do projeto
- Resgatar fundamentos de programação.
- Colocar em prática esses fundamentos
- Criar um pequeno sistema com ferramentas e práticas de mercado.
- Dar mais um passo em direção à preparação para o mercado.
## Visão geral do sistema

 Construir um pequeno sistema (API REST), com java Spring Boot e Banco de Dados H2, de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![alt text](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png)

## Desenvolvimento moderno: relacional -> objeto -> json

![alt text](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png)

## Passos da aplicação
- Criar o projeto.
- Implementar o modelo de domínio.
- Mapeamento objeto-relacional com JPA.
- Configurar o banco de dados H2.
- Criar os endpoints da API REST.
## Trechos de código para copiar
### Configuração do Maven Resources Plugin.

    <plugin>
	    <groupId>org.apache.maven.plugins</groupId>
	    <artifactId>maven-resources-plugin</artifactId>
	    <version>3.1.0</version>
    </plugin>

## Configurações do banco de dados
    # Dados de conexão com o banco H2
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.username=sa
    spring.datasource.password=

    # Configuração do cliente web do banco H2
    spring.h2.console.enabled=true
    spring.h2.console.path=/h2-console

    # Configuração para mostrar o SQL no console
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
## Script SQL
    INSERT INTO tb_department(name) VALUES ('Gestão');
    INSERT INTO tb_department(name) VALUES ('Informática');

    INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
    INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
    INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
    INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
## Collection Postman
https://www.getpostman.com/collections/ac4a49113c4024e47d4f

##### Projeto baseado: https://www.youtube.com/watch?v=D4frmIHAxEY;
