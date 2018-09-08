# proposal-circileci2.0-sbt-docker

[![CircleCI](https://circleci.com/gh/nokamoto/proposal-circileci2.0-sbt-docker.svg?style=svg)](https://circleci.com/gh/nokamoto/proposal-circileci2.0-sbt-docker)

## Build
```bash
sbt scalafmt::test test:scalafmt::test sbt:scalafmt::test test universal:packageZipTarball

VERSION=$(cat VERSION | tr -d '\n')

docker build -t nokamoto/proposal-circileci2.0-sbt-docker:${VERSION} --build-arg VERSION=${VERSION} .
```
