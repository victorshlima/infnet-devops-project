# infnet-devops-project

    
### Requisites
  Do you need install docker, and docker compose
  sudo apt install postgresql-client-common
  sudo apt-get install postgresql-client
  sudo apt-get install -y postgresql-client


##Build
-- download openjdk:11



-- get the image base
docker pull openjdk:11

- Image creation
##docker build -t infnet-devops-project_api  .
#specific to gradle
docker build --build-arg JAR_FILE=build/libs/\*.jar -t infnet-devops-project_api  .

docker run -dp 8080:8088 infnet-devops-project_api

./gradlew clean build


infnet-devops-project_api_1

docker-compose ps
docker exec -it infnet-devops-project_api_1 bash



#https://docs.docker.com/engine/reference/commandline/exec/

##Run
java -jar build/libs/infnet-devops-project-0.0.1-SNAPSHOT.jar

### Tecnologias

 - Actuator
 - Prometeus
 - Micrometer
 - Jenkis
 - Docker
 - zipking

 Execute on project root


 - docker-compose up -d
 -d to execute detached

****
Requisitos
****
****

# Projeto de Conclusão de disciplina.
### Devops e entrega contínua.

- Criar um projeto com Springboot expondo algumas APIS.
  -- Obs. O projeto pode ser o mais simples possível, um CRUD, um conversor de medidas , etc.

- Criar testes unitários para métodos utilizando
    -(x) JUNIT 
    -  MOCKITO0 .
    - TESTContainers (Opcional)

- (x) Expor o health check do seu projeto com o Actuator.
- Exportar métricas do seu projeto para o formato do Prometheus utilizando o micrometer.
- Exportar LOGs do seu projeto para alguma ferramenta de logs. (Ex. Papertrail)
- Exportar dados do seu projeto para o Zipkin.
- Criar Script no terraform em qualquer provedor que crie apenas uma máquina virtual de qualquer formato. Esse script deve possuir 1 arquivo main, um arquivo de variáveis e um arquivo de outputs.

- Criar um pipeline de build do seu projeto no Gitlab.
# Grupos.
- Podem ser feitos em grupos de até 5 participantes.
# Regras de entrega.

- Projeto deve estar versionado em alguma ferramenta de versionamento.(Github, bitbuck,etc.).
- Projeto deve estar público.
- Deve ser entregue o link para o projeto.
- Na raiz do projeto deve ter arquivos de imagem com printscreens do zipking rodando.
- Todos devem postar o link para o projeto no Moodle. Aqueles que fizerem em grupo colocar no README do projeto o nome do grupo.
****

