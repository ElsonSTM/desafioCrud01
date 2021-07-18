# Desafio 01 - CRUD - BootCamp DevSuperior

Instruções de instalação no windows

Resquisitos de sofware instalados no sistema windows:

As Ide's vocês podem escolher Spring ou Eclipse

* SpringBoot Framework [Baixar](https://spring.io/projects/spring-boot)
* Ide Eclipse [Baixar](https://www.eclipse.org/downloads/)
* Postman [Baixar](https://www.postman.com/downloads/)
* Java SE 11 (JDK) [Baixar](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
* GitHub [Instalar](https://github.com/git-guides/install-git)

1- git clone https://github.com/ElsonSTM/desafioCrud01.git

2- Importar o projeto para a plaforma da Ide escolhida.

3- Rodar o projeto.

4- Utilizar o Postman para testar as rotas.

   Rotas disponiveis para test:

   POST -> Client: Criar

   http://localhost:8080/clients

   GET -> Client: Lista paginada  

   http://localhost:8080/clients?clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

   GET -> Client Listar por id

   http://localhost:8080/clients/1

   PUT -> Client: Atualizar

   http://localhost:8080/clients/1

   Delete -> Client: Deletar 

   http://localhost:8080/clients/1

5- Exemplos
   
   ``
    Exemplo de inserção de cliente
   ``
   ```
   POST /clients
    {
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
     }
   ```

   ``
   Atualização de cliente
   ``
   ```
   PUT /clients/1
    {
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
    }

   ```
6- O projeto já vai configurado para com insert de 10 clientes na base de dados em memória, via biblioteca spring.H2.


