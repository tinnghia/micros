FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ARG JAR_FILE
COPY ./${JAR_FILE} /tmp/app.jar
WORKDIR /tmp/
RUN sh -c 'touch /tmp/app.jar' 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/app.jar"]
