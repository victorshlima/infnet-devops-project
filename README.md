# infnet-devops-project

#2

### Requisites
  Do you need install docker, and docker compose
  sudo apt install postgresql-client-common
  sudo apt-get install postgresql-client
  sudo apt-get install -y postgresql-client
  docker pull gradle:7.4.2-jdk11

docker-compose up -d zipkin_infnet grafana prometheus postgres jenkins


# gitlab
cat ~/.shh/XXX.pub 
add on gitlab


#Jenkins - first acess
docker pull jenkins
docker container exec -it 3361ede4dc96 /bin/sh
cat var/jenkins_home/secrets/initialAdminPassword
"get the password"
#install sugested plugins inside of containet EXEC
jenkins-plugin-cli --plugins ssh-credentials:1.19

#Local - admin - admin
docker-compose up -d zipkin_infnet grafana prometheus

# jenkins - config
New node -> docker


#papertrailapp.com/

https://my.papertrailapp.com/

- fazer cadastro
- install local

wget -qO - --header="X-Papertrail-Token: m6Zu9aH2FciRb3MfZMlY" https://papertrailapp.com/destinations/31164911/setup.sh | sudo bash

criar o arquivo logback.xml na pasta resources

get info on https://papertrailapp.com/account/destinations
and set on syslogHost and port

<syslogHost>logs3.papertrailapp.com</syslogHost>
<port>23047</port>

Settings > account 
 enable (x) HTTP(s) URLs

View the logs on https://my.papertrailapp.com/events

##Build
-- download openjdk:11

-- get the image base
docker pull openjdk:11
docker pull egis/papertrail
docker pull openzipkin/zipkin

#zipkin
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar


- Image creation
##docker build -t infnet-devops-project_api  .
#specific to gradle

##criar um script

./gradlew clean build
--spring.profiles.active=dev

docker image rm -f <image_id>
docker build --build-arg JAR_FILE=build/libs/\*.jar -t infnet-devops-project_api  .
docker run -dp 8088:8088 <IMAGE_ID>
docker-compose ps
docker exec -it infnet-devops-project_api_1 bash

]docker-compose up -d

# Docker Stop
docker-compose down
docker-compose -p infnet-devops-project stop api

GET http://localhost:8088/actuator/metrics
GET http://localhost:8088/actuator/prometheus
http://localhost:3003/login - admin - admin
http://localhost:9090/graph?g0.expr=&g0.tab=1&g0.stacked=0&g0.show_exemplars=0&g0.range_input=1h

#Phometeus
up{instance="host.docker.internal:8088", job="spring-observability"}
up{instance="localhost:9090", job="prometheus"}
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

# Projeto de Conclus??o de disciplina.
### Devops e entrega cont??nua.

- Criar um projeto com Springboot expondo algumas APIS.
  -- Obs. O projeto pode ser o mais simples poss??vel, um CRUD, um conversor de medidas , etc.

- Criar testes unit??rios para m??todos utilizando
    -(x) JUNIT 
    -  MOCKITO0 .
    - TESTContainers (Opcional)

- (x) Expor o health check do seu projeto com o Actuator.
- (x) Exportar m??tricas do seu projeto para o formato do Prometheus utilizando o micrometer.
- (x) Exportar LOGs do seu projeto para alguma ferramenta de logs. (Ex. Papertrail)
- Exportar dados do seu projeto para o Zipkin.
- Criar Script no terraform em qualquer provedor que crie apenas uma m??quina virtual de qualquer formato. Esse script deve possuir 1 arquivo main, um arquivo de vari??veis e um arquivo de outputs.

- Criar um pipeline de build do seu projeto no Gitlab.
# Grupos.
- Podem ser feitos em grupos de at?? 5 participantes.
# Regras de entrega.

- (x) Projeto deve estar versionado em alguma ferramenta de versionamento.(Github, bitbuck,etc.).
- (x) Projeto deve estar p??blico.
- Deve ser entregue o link para o projeto.
- Na raiz do projeto deve ter arquivos de imagem com printscreens do zipking rodando.
- Todos devem postar o link para o projeto no Moodle. Aqueles que fizerem em grupo colocar no README do projeto o nome do grupo.
****
