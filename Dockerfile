FROM gradle:jdk11
MAINTAINER  "vlima@<victorshlima@gmail.com>"

#TODO criar uma pasta para o projeto
COPY build/libs/infnet-devops-project-0.0.1-SNAPSHOT.jar infnet-devops-project-0.0.1-SNAPSHOT.jar
#Release Exteranal access
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "infnet-devops-project-0.0.1-SNAPSHOT.jar"]