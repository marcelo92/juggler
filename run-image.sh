#!/bin/bash
docker rm -f demo
docker build -t demodb .
docker run -d \
  -p 3306:3306 \
  --name demo \
  -e MYSQL_USER=user \
  -e MYSQL_PASSWORD=12345 \
  -e MYSQL_ROOT_PASSWORD=root \
  demodb
