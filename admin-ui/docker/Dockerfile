# 拉去nginx 基础镜像
FROM nginx

# 维护者信息
MAINTAINER aircraft

# 将dist文件中的内容复制到 /usr/share/nginx/html/
COPY dist/ /usr/share/nginx/html/

# 用本地配置文件来替换nginx镜像里的默认配置
COPY nginx.conf /etc/nginx/nginx.conf

# 对外暴露端口
EXPOSE 10000

# 启动nginx容器
CMD ["nginx","-g","daemon off;"]