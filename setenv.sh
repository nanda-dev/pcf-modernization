#!/usr/bin/env bash
export SPRING_PROFILES_ACTIVE=development

export EUREKA_CLIENT_ENABLED=false
export RIBBON_EUREKA_ENABLED=false

export ALBUM_SERVICE_RIBBON_LISTOFSERVERS=http://localhost:8081
export MOVIE_SERVICE_RIBBON_LISTOFSERVERS=http://localhost:8082

export MOVIES_PAGESIZE=3