FROM openjdk:8-jdk-slim
#FROM fabric8/java-alpine-openjdk8-jre

RUN jarfile=`find . -name "my-test-app-*SNAPSHOT.jar"`
COPY $jarfile /tmp/my-test-app.jar
COPY target/classes/app.yml /tmp/app.yml
COPY start.sh /tmp/start.sh

RUN chmod a+x /tmp/start.sh

CMD ["/tmp/start.sh"]
