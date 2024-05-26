# Como executar o backend do projeto

## 1- coisas necessárias
- Docker ou postgres instalado na máquina
- java 21 ou posterior
- IDE ou compilador para o código
- dbeaver (recomendado, para consultas no banco caso precisemos de alterações futuras)

## 2 - executando o projeto
Após você clonar ele, você pode abrir o projeto em seu IDE de preferência
e mandar executar ou abrir o terminal e executar umm dos seguintes comandos:
> gradle bootRun


Se voce for mais experiente deve achar estranho que não citei a criação de um banco de dados ou execução de um docker-compose,
isso se deve a dependencia abaixo que ja faz isso automaticamente só de identificar o arquivo docker-compose, veja a documentação.

- https://spring.io/blog/2023/06/21/docker-compose-support-in-spring-boot-3-1
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.docker-compose
- https://www.baeldung.com/docker-compose-support-spring-boot

Agora falando em testes, é o mesmo, mas com um dos seguintes comandos:
> gradle test

> ./gradlew test

Depois disso, basta acessar o swagger na seguinte url ou usar a coleção
do postman que está na pasta resources para testar os endpoints e retornos.

> http://localhost:8080/coracao-das-cartas/v2/swagger-ui/index.html#/


## Bibliografia

- spring security : https://youtu.be/KxqlJblhzfI?feature=shared
- spring security : https://youtu.be/E03Q77IgU9g?feature=shared