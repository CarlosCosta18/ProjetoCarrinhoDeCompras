
# 🛒 Sistema de Carrinho de Compras em Java

Bem-vindo ao **Sistema de Carrinho de Compras**! Este projeto, desenvolvido em Java, simula um sistema simples de compras onde o usuário pode selecionar produtos, adicionar ao carrinho e visualizar o valor total com desconto aplicado.  

---

## 📌 Funcionalidades Principais

✔️ **Cadastro de Produtos:** Leitura de produtos a partir de um arquivo de texto.  
✔️ **Busca de Produtos:** O usuário pode procurar produtos pelo código.  
✔️ **Adição ao Carrinho:** Permite adicionar produtos e definir quantidades.  
✔️ **Cálculo de Desconto:** O sistema aplica um desconto sobre o valor total.  
✔️ **Exibição do Carrinho:** Lista os produtos adicionados, suas quantidades e preços.  

---

## 🏗 Estrutura do Projeto

O projeto é dividido nas seguintes classes:

### 🔹 Produto  
Gerencia os produtos disponíveis, carregando as informações de um arquivo externo.

### 🔹 ItemCompra  
Representa um item comprado, contendo a descrição, quantidade e preço.

### 🔹 Carrinho  
Armazena os itens selecionados pelo usuário, calcula o total e aplica descontos.

### 🔹 ProjetoEstruturaDeDados (Main)  
Controla a execução do programa, permitindo que o usuário interaja com o sistema.

---

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Compile o código:
   ```bash
   javac *.java
   ```
3. Execute o programa:
   ```bash
   java ProjetoEstruturaDeDados
   ```

---

## 📌 Requisitos

- Java 8 ou superior  
- Um arquivo `PRODUTOS.txt` contendo os produtos no formato:  
  ```
  1;Produto Exemplo;19.99
  2;Outro Produto;35.50
  ```
  
---

## 📜 Licença
@CarlosCosta
---
Este projeto é de livre uso para fins acadêmicos. ✨  

🚀 *Feito com dedicação e muito código!* 💻🔥
