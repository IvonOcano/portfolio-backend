
FROM amazoncorretto:17-alpine-jdk

MAINTAINER emaaristimuno

COPY target/ArgPro-0.0.1-SNAPSHOT.jar ArgPro-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ArgPro-0.0.1-SNAPSHOT.jar"]