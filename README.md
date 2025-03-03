# To-Do List

## 📌 Sobre o projeto

O **To-Do List** é uma aplicação web desenvolvida para gerenciar tarefas diárias. Permite aos usuários adicionar, visualizar, editar e remover tarefas, proporcionando uma interface intuitiva para organização pessoal.

## 🚀 Tecnologias utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- **[Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)** - Linguagem de programação
- **[Spring Boot](https://spring.io/projects/spring-boot)** - Framework para criação de aplicações Java
- **[Maven](https://maven.apache.org/)** - Gerenciador de dependências e build
- **[MySQL](https://www.mysql.com/)** - Banco de dados relacional
- **[Postman](https://www.postman.com/)** - Ferramenta para testar APIs

## ⚙️ Instalação e configuração

Para executar o projeto localmente, siga os passos abaixo:

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/MiguelPoleto/to-do-list.git
   ```
2. **Acesse o diretório do projeto:**
   ```sh
   cd to-do-list
   ```
3. **Configure o banco de dados:**
   - Certifique-se de que o MySQL esteja instalado e em execução.
   - Crie um banco de dados chamado `todolist`.
   - Atualize as configurações de conexão no arquivo `src/main/resources/application.properties` com suas credenciais do MySQL.
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todolist
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     ```
4. **Compile o projeto e resolva as dependências com o Maven:**
   ```sh
   mvn clean install
   ```
5. **Execute a aplicação:**
   ```sh
   mvn spring-boot:run
   ```
6. **Acesse a aplicação no navegador:**
   ```
   http://localhost:8080
   ```
7. **Testando a API:**
   - Utilize uma ferramenta como o **[Postman](https://www.postman.com/)** para testar as requisições da API (GET, POST, PUT, DELETE).

## 📌 Funcionalidades

- ✅ Adicionar novas tarefas
- ✅ Visualizar tarefas existentes
- ✅ Editar tarefas
- ✅ Excluir tarefas
- ✅ Marcar tarefas como concluídas

## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir com este projeto:

1. Faça um **fork** do repositório.
2. Crie uma **branch** para sua feature (`git checkout -b minha-feature`).
3. Faça o **commit** das suas alterações (`git commit -m 'Adicionei uma nova feature'`).
4. Faça o **push** para a branch (`git push origin minha-feature`).
5. Abra um **Pull Request**.


## Contato

Caso tenha dúvidas ou sugestões, entre em contato:
- GitHub: [MiguelPoleto](https://github.com/MiguelPoleto)
- LinkedIn: [miguelpoleto](https://www.linkedin.com/in/miguelpoleto/)
- E-mail: *miguelpoleto5@gmail.com*
- Instagram: [@miguelsantuchi](https://www.instagram.com/miguelsantuchi/)

