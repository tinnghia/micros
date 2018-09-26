FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp

ADD ./target/customer-service-1.0.0.jar /tmp/app.jar
WORKDIR /tmp/
RUN sh -c 'touch /tmp/app.jar' 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/app.jar"]
