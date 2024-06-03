#  RamenGO!  

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

**Live demo**: https://ramengo-aadp.onrender.com

# Descrição

O presente repositório contém o teste prático da Red Ventures para vaga de Software Engineer.</br>

# Objetivo
O objetivo neste teste é construir uma API para uma aplicação web chamada RamenGo, uma plataforma para que o usuário possa montar um pedido de ramen, escolhendo os tipos de caldos e proteínas do prato.</br>
</br>
Você deverá criar endpoints em sua API que fornecerão as opções disponíveis de caldos e proteínas.</br>
</br>
Esses endpoints deverão retornar dados que serão utilizados para popular listas de seleção para o usuário, no qual o mesmo poderá selecionar apenas uma opção de cada lista para montar o seu pedido.</br>
</br>
Além dos endpoints de listagem, você deverá criar um endpoint que permitirá ao usuário fazer um pedido. Este endpoint deverá receber as seleções do usuário e processar o pedido, retornando uma confirmação com um código do pedido.</br>

## Como executar este projeto
##### Pré-requisitos:
- **Java 17**: [JDK 17](https://www.oracle.com/java/technologies/downloads/) ou superior.
- **IDEs**: [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou [Spring Tools](https://spring.io/tools).

##### Passos:

1. **Clone o repositório**</br>
   Abra o terminal e navegue até o diretório onde deseja armazenar o projeto. Execute o seguinte comando para clonar o repositório:

```bash
git clone https://github.com/guilchaves/ramengo.git
```
2. **Abra o projeto no IntelliJ IDEA ou STS:**</br>
- _IntelliJ IDEA_: Abra o IntelliJ IDEA e selecione "Open" no menu principal. Navegue até o diretório do projeto e selecione o arquivo pom.xml.
- _Spring Tools Suite_: Abra o STS e selecione "Import...​" > "Existing Maven Projects". Navegue até o diretório do projeto e selecione o arquivo pom.xml.

3. **Baixe as dependências do Maven:**</br>
   Aguarde até que o IntelliJ ou STS baixe automaticamente as dependências do Maven. Isso pode levar algum tempo, dependendo da conexão com a internet.</br></br>
4. Altere o perfil ativo da aplicação para `spring.profiles.active=prod` em `resources/application.properties`</br><br>
5. **Execute o projeto:**</br>
   No projeto, navegue até o arquivo `src/main/java/br/com/guilchaves/ramengo/RamengoApplication.java`. Este arquivo contém
   a classe principal da aplicação Spring Boot.</br>
- _IntelliJ IDEA_: Clique com o botão direito do mouse no arquivo DscatalogApplication.java e escolha "Run DscatalogApplication".
- _Spring Tools Suite_: Clique com o botão direito do mouse no projeto no navegador de projetos e escolha "Run As" > "Spring Boot App".

6. **Verifique a Execução:**</br>
   Após a execução bem-sucedida, abra um navegador da web e acesse `http://localhost:8080` (ou a porta configurada, se diferente) para verificar se a aplicação está em execução.</br>
   Acesse `http://localhost:8080/h2-console` para utilizar o console do H2 database.</br>
 
## Endpoints

```
GET /broths - Lista todas as opções de caldos.

GET /proteins - Lista todas as opções de proteínas.

POST /orders - Realiza pedido. 
```
---
</br>Candidato: Guilherme Gonçalves Chaves