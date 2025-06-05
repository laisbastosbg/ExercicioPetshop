# 🚿 PetShop - Sistema de Banho para Pets

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)](https://www.oracle.com/java/)
[![DIO](https://img.shields.io/badge/DIO-Digital%20Innovation%20One-red?style=for-the-badge)](https://www.dio.me/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Bootcamp](https://img.shields.io/badge/Bootcamp-TONNIE%20Java%20and%20AI%20in%20Europe-blue?style=for-the-badge)](https://www.dio.me/bootcamp)

---

<img src="https://cdn-icons-png.flaticon.com/512/616/616408.png" alt="Petshop Logo" width="150" align="right">

## 📚 Sobre o Projeto

Este projeto é uma simulação de um sistema de gerenciamento de banhos em pets, desenvolvido como parte do **curso *"Java e a Arte da Abstração com Classes e Encapsulamento"*** do **BootCamp TONNIE - Java and AI in Europe**, promovido pela plataforma **DIO - Digital Innovation One**.

---

## 🛠️ Tecnologias e Conceitos Utilizados

* **Java** (JDK 17+)
* Paradigmas de **Programação Orientada a Objetos**:

  * Modelos com encapsulamento
  * Classes e métodos com acesso controlado
  * Separação entre **Model**, **Controller** e **View**
* Arquitetura inspirada no **MVC** (Model-View-Controller)
* Interação via **console** (CLI)

---

## 🏛️ Estrutura do Projeto

```plaintext
src/
 └── petshop/
      ├── model/       → Representação de Pet e Máquina de Lavagem
      ├── controller/  → Regras de negócio para banho e manutenção
      ├── view/        → Interface de interação com o usuário (console)
      └── Main.java    → Ponto de entrada da aplicação
```

---

## 🖼️ Diagrama Conceitual

```plaintext
+----------------+       +--------------------+       +----------------+
|     View       | <---> |     Controller      | <--> |     Model      |
| (Menu - CLI)   |       | (BanhoController)   |      | (Pet, Maquina) |
+----------------+       +--------------------+       +----------------+
```

---

## 🚀 Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/petshop-sistema-banho.git
   ```

2. Compile e execute com uma IDE Java ou pelo terminal:

   ```bash
   javac src/petshop/**/*.java -d out
   java -cp out petshop.Main
   ```

3. Siga o menu interativo via console para realizar as operações.

---

## 🎯 Funcionalidades

- ✅ Colocar pet na máquina
- ✅ Retirar pet da máquina
- ✅ Dar banho no pet
- ✅ Limpar a máquina de lavagem
- ✅ Abastecer água e shampoo
- ✅ Consultar níveis de recursos
- ✅ Verificar se há pet na máquina

---

## 🎓 Aprendizados

Este projeto foi essencial para reforçar o entendimento sobre:

* O papel do **encapsulamento** e do **acesso controlado** (`private`, `package-private` etc).
* Como **evitar regras de negócio nos modelos** (Model) e mantê-las exclusivamente nos **Controllers**.
* A importância de manter o código **modular**, **organizado** e **legível**.

---

## 🤝 Agradecimentos

Agradeço ao **BootCamp TONNIE - Java and AI in Europe** e à **DIO - Digital Innovation One** pela oportunidade de aprimorar meus conhecimentos em Java e boas práticas de desenvolvimento.

---

## 📄 Licença

Este projeto é de caráter **educacional** e está sob a licença **MIT** — sinta-se à vontade para utilizá-lo e adaptá-lo.

---

## 👤 Autor

Lais Godinho
[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=flat\&logo=linkedin)](https://linkedin.com/in/lais-godinho)
[![GitHub](https://img.shields.io/badge/GitHub-black?style=flat\&logo=github)](https://github.com/laisbastosbg)

