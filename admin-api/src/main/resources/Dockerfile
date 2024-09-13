# 基础镜像使用java
FROM openjdk:11
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 这个地方我填写的是后端jar包名称，例如你的jar包名字叫aa.jar  这个地方就填aa.jar aa.jar(填两遍)
ADD admin-api.jar admin-api.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/admin-api.jar"]
