FROM openjdk
EXPOSE 8050
ADD target/sample-1-0.0.1-SNAPSHOT.jar cicd.jar
ENTRYPOINT [ "java", "-jar", "cicd.jar" ]