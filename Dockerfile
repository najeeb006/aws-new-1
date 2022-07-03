FROM openjdk:17
EXPOSE 8000
ADD target/aws-new-0.0.1-SNAPSHOT.jar aws-new-0.0.1-SNAPSHOT
ENTRYPOINT ["java","-jar","/aws-new-0.0.1-SNAPSHOT"]