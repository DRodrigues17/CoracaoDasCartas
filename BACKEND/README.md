# Como executar o backend do projeto

## 1- coisas necessárias
- Docker ou postgres instalado na máquina
- java 17 ou posterior
- IDE ou compilador para o código
- dbeaver (recomendado, para consultas no banco caso precisemos de alterações futuras)

## 2 - executando o projeto
Após você clonar ele, você pode abrir um terminal na pasta raiz e executar
o seguinte comando para ter o banco de dados na sua máquina:
> docker-compose up -d

Você não rpecisa usar docker se não quiser e se tiver o postgres instalado pode só pular
para os próximos passos.

Após ter o banco de dados na sua máquina, você pode abrir o projeto em seu IDE de preferência
e mandar executar ou abrir o terminal e executar umm dos seguintes comandos:
> gradle bootRun

> ./gradlew bootRun

Agora falando em testes, é a mesma coisa, mas com um dos seguintes comandos:
> gradle test

> ./gradlew test

Depois disso, basta acessar o swagger na seguinte url ou usar a coleção
do postman que está na pasta resources para testar os endpoints e retornos.

> http://localhost:8080/heart-of-cards/v1/swagger-ui/index.html#/
