FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
EXPOSE 8091
ARG JAR_FILE=target/m5.jar
ADD ${JAR_FILE} like.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar like.jar" ]