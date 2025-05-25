#  MyBikes API

  
Esta API permite gerenciar motos e locações, com funcionalidades completas de cadastro, busca, atualização e remoção de registros, utilizando Spring Boot, JPA e banco H2 em memória.


## Integrantes

- Lucas de Melo RM558791
- Guilherme Jesus Lima RM555002
- Jean Roberto Gomes RM94418


##  Tecnologias utilizadas

- Java 17
- Spring Boot 3.5.0
- Spring Data JPA
- H2 Database (em memória)
- Lombok
- Swagger/OpenAPI (Springdoc)


## Como executar o projeto

### Pré-requisitos

- Java 17+
- Maven 3.8+

### Passos

1. **Clone o projeto:**

git clone https://github.com/seu-usuario/MyBikes.git
cd MyBikes

Execute Normalmente:
Apenas de Run no projeto no Visual Studio Code

Execute com Maven:
mvn spring-boot:run

A aplicação estará disponível em:
http://localhost:8080/swagger-ui/index.html

Acesse a documentação Swagger:

http://localhost:8080/swagger-ui.html

Endpoints disponíveis

Motos
Método -	Endpoint -	Descrição
POST -	/motos -	Cadastrar uma nova moto
GET -	/motos -	Listar todas as motos
GET -	/motos/{id} -	Buscar moto por ID
PUT -	/motos/{id} -	Atualizar dados de uma moto
DELETE -	/motos/{id} -	Remover moto
GET -	/motos/busca?marca=Hond -a	Buscar motos por marca

Exemplo de criação de moto (POST /motos)

{
  "modelo": "CB 500F",
  "marca": "Honda",
  "placa": "ABC1234",
  "ano": 2023
}

Locações
Método	Endpoint	Descrição
POST -	/locacoes -	Criar uma nova locação
GET -	/locacoes -	Listar todas as locações
GET -	/locacoes/{id} -	Buscar locação por ID
PUT -	/locacoes/{id} -	Atualizar dados da locação
DELETE -	/locacoes/{id} -	Remover locação

Exemplo de criação de locação (POST /locacoes)
json
Copiar
Editar
{
  "moto": { "id": 1 },
  "cliente": "Lucas de Melo",
  "dataInicio": "2025-06-01",
  "dataFim": "2025-06-10"
}
Banco de dados H2
Durante a execução, você pode acessar o console do H2 para inspecionar os dados:
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Senha: (deixe em branco)

