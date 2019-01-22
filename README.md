# spring-cloud-alibaba 学习案例


## 准备工作


### 安装nacos

下载地址： [nacos](https://github.com/alibaba/nacos/releases)


docker方式：

~~~
docker run -d --name nacos-standalone -e MODE=standalone -p 8848:8848 nacos/nacos-server:latest
~~~


启动后访问 `http://127.0.0.1:8848/nacos/` ，进入服务管理页面。

