# Sistema de Cadastro de Ninjas

Bem-vindo ao **Sistema de Cadastro de Ninjas**!  
Este projeto é uma aplicação de arquitetura em camadas desenvolvida com Spring Boot, projetada para cadastrar ninjas e suas respectivas missões.  

O projeto utiliza **H2** como banco de dados em memória, **Flyway** para migrações de banco de dados e segue boas práticas de desenvolvimento de software, como controle de versão com **Git** e hospedagem no **GitHub**. O projeto também inclui aulas extras sobre banco de dados, abordando o tema de maneira mais profunda.

---

## Visão Geral do Projeto

Este sistema foi desenvolvido para gerenciar ninjas e suas missões.  
Cada ninja pode ser atribuído a uma única missão, enquanto uma missão pode ser associada a vários ninjas.  

As principais funcionalidades incluem:  
- Cadastro de ninjas com nome, idade, email e rank.  
- Atribuição de uma missão para um ninja.  
- Gerenciamento de missões e dos ninjas associados a elas.

---

## Tecnologias Utilizadas

- **Spring Boot**: Para criação da aplicação web e gerenciamento de dependências.
- **Banco de Dados H2**: Banco de dados em memória para desenvolvimento e testes.
- **Flyway**: Para gerenciamento de migrações do banco de dados.
- **JPA (Java Persistence API)**: Para mapeamento objeto-relacional (ORM).
- **Spring Data JPA**: Para interação com o banco de dados.
- **Git**: Controle de versão para gerenciamento de mudanças no código.
- **GitHub**: Hospedagem do repositório para controle de versão.
- **Maven**: Para build e gerenciamento de dependências do projeto.
- **Docker**: Para build externo do banco de dados.
- **SQL**: Manipulação e consulta no banco de dados.

---

## Design do Banco de Dados

O esquema do banco de dados segue as seguintes relações:

### Entidades
- **Ninja**: Contém atributos como `id`, `nome`, `idade`, `email` e `rank`.
- **Missão**: Contém atributos como `id`, `título` e `descrição`.

### Relacionamentos
- Um **Ninja** pode estar associado a **uma única Missão**.
- Uma **Missão** pode ser atribuída a **vários Ninjas**.

---
