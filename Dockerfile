FROM openjdk:8

ADD target/dockerdemo.jar /app/dockerdemo.jar

# 声明服务运行在8080端口
EXPOSE 8080

WORKDIR /app
CMD ["java", "-version"]
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]