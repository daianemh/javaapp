
## **Tecnologias Utilizadas**

- **Java 17**
- **Spring Boot 3**
  - Spring Data JPA
  - Spring Security
  - Spring Web
  - Flyway Migration
  - Spring Boot DevTools
- **Maven**
- **Banco de Dados H2 (ou MySQL, dependendo da configuração)**
- **JWT (JSON Web Token)**
- **Swagger (SpringFox)**

---

## **Funcionalidades**

1. **Gerenciamento de Tópicos**
   - Criar, listar, atualizar e excluir tópicos.
   - Validar dados de entrada.
   - Evitar duplicidade de tópicos (título e mensagem).

2. **Autenticação**
   - Autenticação baseada em JWT.
   - Login para usuários registrados.

3. **Gerenciamento de Usuários e Respostas**
   - CRUD completo para usuários.
   - Gerenciamento de respostas associadas aos tópicos.

4. **Documentação da API**
   - Swagger UI para testar endpoints.

---

## **Requisitos**

- Java 17 ou superior.
- Maven 4.x.
- IntelliJ IDEA ou qualquer IDE de sua preferência.
- Banco de dados H2 (configuração padrão) ou MySQL.

---

## **Instalação e Configuração**

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/seu-usuario/forum-api.git
   cd forum-api
   ```

2. **Configure o Banco de Dados**
   - O arquivo padrão utiliza H2:
     ```properties
     spring.datasource.url=jdbc:h2:mem:testdb
     spring.datasource.driver-class-name=org.h2.Driver
     spring.datasource.username=sa
     spring.datasource.password=
     ```
   - Para MySQL, substitua as configurações no arquivo `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
     ```

3. **Instale as Dependências**
   ```bash
   mvn install
   ```

4. **Execute a Aplicação**
   ```bash
   mvn spring-boot:run
   ```

5. **Acesse a Aplicação**
   - Documentação Swagger UI: [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)
   - Console H2 (se habilitado): [http://localhost:8080/h2-console/](http://localhost:8080/h2-console/)

---

## **Endpoints Principais**

### **Autenticação**
- **POST** `/auth/login`  
  Recebe login e senha e retorna um token JWT.

### **Tópicos**
- **POST** `/topicos`  
  Cria um novo tópico.  
  Exemplo de Payload:
  ```json
  {
    "titulo": "Título do Tópico",
    "mensagem": "Mensagem do Tópico",
    "autor": "Autor do Tópico",
    "curso": "Curso Relacionado"
  }
  ```

- **GET** `/topicos`  
  Lista todos os tópicos.

- **PUT** `/topicos/{id}`  
  Atualiza um tópico existente.

- **DELETE** `/topicos/{id}`  
  Exclui um tópico por ID.

### **Usuários**
- **POST** `/usuarios`  
  Cria um novo usuário.

- **GET** `/usuarios`  
  Lista todos os usuários.

- **DELETE** `/usuarios/{id}`  
  Exclui um usuário por ID.

---

## **Testes**

Para testar a API, você pode usar ferramentas como [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/). 

---

## **Contribuição**

Sinta-se à vontade para contribuir com este projeto. Para isso:

1. Fork o repositório.
2. Crie uma branch para sua funcionalidade:  
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Commit suas alterações:  
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o repositório principal:  
   ```bash
   git push origin feature/nova-funcionalidade
   ```

---

## **Licença**

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

--- 

Se precisar de mais ajustes ou quiser incluir algo específico, me avise!
