FROM amazoncorretto:17.0.10-alpine

WORKDIR app

COPY build/libs/finance-administration.jar .

ENTRYPOINT ["java","-jar", "finance-administration.jar"]