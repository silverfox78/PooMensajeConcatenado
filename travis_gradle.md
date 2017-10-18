# Pensando en Travis

Agregar al proyecto un archivo llamado [**.travis.yml**]

El contenido de este archivo debe ser:

En [**.travis.yml**]
```
    language: java
    jdk:
    - oraclejdk8

    before_install:
    - chmod +x gradlew
```

Y a la carpeta que contiene el proyecto GIT debe ejecutarse los siguientes comandos:

En [**GIT - BASH**]
```
git update-index --chmod=+x gradlew
git ls-tree HEAD
git update-index --chmod=+x gradlew
git ls-tree HEAD
git update-index --chmod=+x gradlew
git commit -m "permission access for travis"
git ls-tree HEAD
```