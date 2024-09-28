FROM openjdk:17
EXPOSE 8000
ADD target/jenkins-example.jar jenkins-example.jar
ENTRYPOINT [ "java", "-jar", "jenkins-example.jar" ]