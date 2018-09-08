FROM openjdk:8u181-jre-slim

ARG VERSION

ARG APP=proposal-circileci2-0-sbt-docker

COPY target/universal/${APP}-${VERSION}.tgz .

RUN tar -zxvf ${APP}-${VERSION}.tgz && mv ${APP}-${VERSION} ${APP}

RUN rm ${APP}-${VERSION}.tgz

# ENTRYPOINT [ "${APP}/bin/${APP}" ]
ENTRYPOINT [ "proposal-circileci2-0-sbt-docker/bin/proposal-circileci2-0-sbt-docker" ]

CMD [ "-h" ]
