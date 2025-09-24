# 🖥️ Sistema de Cadastro (CRUD de Usuários e Clientes)

Este projeto é um sistema desktop desenvolvido em **Java Swing**, com o objetivo de gerenciar usuários e clientes de forma simples e intuitiva.  
Ele utiliza o padrão MVC, integra-se a um banco de dados (via DAO) e possui telas de login, menu principal e CRUD completo.

---

## 📋 Funcionalidades

- **Login de Usuário**
  - Validação de credenciais.
  - Acesso ao menu principal após login bem-sucedido.
  
- **Menu Principal**
  - Acesso às opções de cadastro:
    - **Usuário** – CRUD completo (Cadastrar, Listar, Editar, Excluir).
    - **Cliente** – CRUD completo (Cadastrar, Listar, Editar, Excluir).
  - Opção de **Sair** para fechar o sistema.

- **CRUD Usuário e Cliente**
  - Cadastro de novos registros.
  - Edição de registros existentes.
  - Exclusão de registros.
  - Listagem em tabela (JTable) com atualização em tempo real.
  - Campos de pesquisa e filtros.
  - Validações de entrada.

---

## 🏗️ Estrutura do Projeto

src/
├── br.ulbra.controller/ # Controllers (lógica de negócio)
├── br.ulbra.dao/ # DAOs (acesso ao banco de dados)
├── br.ulbra.model/ # Classes de modelo (entidades)
└── br.ulbra.view/ # Telas (LoginView, MenuPrincipalView, ClienteView, UsuarioView)

yaml
Copiar código

---

## 🚀 Fluxo do Sistema

1. **LoginView** → Tela inicial onde o usuário digita login e senha.
2. **MenuPrincipalView** → Abre após login bem-sucedido, exibindo opções de cadastro.
3. **ClienteView / UsuarioView** → CRUD completo de cada entidade, abrindo em janelas independentes.

---

## 🖼️ Telas do Sistema

- **Login:** Autenticação de usuário.  
- **Menu Principal:** Menu superior com acesso às telas de cliente e usuário.  
- **Cadastro de Usuário:** Formulário para gerenciar usuários.  
- **Cadastro de Cliente:** Formulário para gerenciar clientes.  

---

## ⚙️ Como Executar

1. Clone ou baixe este repositório.
2. Abra o projeto na sua IDE (NetBeans, IntelliJ ou Eclipse).
3. Configure a conexão com o banco de dados em `Conexao.java`.
4. Compile e execute a classe `LoginView` para iniciar o sistema.

---

## 🛠️ Tecnologias Utilizadas

- **Java 8+**
- **Swing** (interface gráfica)
- **JDBC** (acesso ao banco de dados)
- **MVC** (padrão de arquitetura)

---

## 📌 Melhorias Futuras

- Adicionar criptografia de senha.
- Implementar sistema de permissões (níveis de acesso).
- Melhorar layout com ícones e cores personalizadas.
- Adicionar relatórios em PDF.

---

## 👨‍💻 Autor

Desenvolvido por **Gabriel Santos de Sandes**  
💡 Projeto acadêmico – Técnico em Informática (Colégio ULBRA São Lucas)
