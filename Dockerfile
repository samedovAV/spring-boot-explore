FROM bellsoft/liberica-openjdk-alpine:21

WORKDIR /app

COPY . .

RUN ./gradlew build

ENV JAVA_TOOL_OPTIONS "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"

CMD ["java", "-jar", "build/libs/spring-boot-explore-0.0.1-SNAPSHOT.jar"]