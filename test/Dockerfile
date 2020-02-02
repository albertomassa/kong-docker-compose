FROM openjdk:8

ENV APP_NAME=am-api-service
ENV APP_PROFILE DEV

COPY ./${APP_NAME}.jar /usr/${APP_NAME}/

RUN chgrp -R 0 /usr/${APP_NAME}/ && \
    chmod -R g=rwx /usr/${APP_NAME}/

EXPOSE 8080

USER 1001

WORKDIR /usr/${APP_NAME}/

CMD java -jar ${APP_NAME}.jar --spring.profiles.active=${APP_PROFILE}
