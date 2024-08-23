#imagem java 17
FROM openjdk:17-jdk-alpine

#definindo diretório de trabalho
WORKDIR /app

#copiar o arquivo jar pro diretório app
COPY target/*jar /app/app.jar

#rodando a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]