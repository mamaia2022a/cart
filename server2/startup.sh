#!/bin/sh
mvn spring-boot:run & echo $! > pidmvn.txt
disown

