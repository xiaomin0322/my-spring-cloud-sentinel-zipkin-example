# spring-cloud-alibaba 学习案例

## 准备工作

首先准备nacos server，我这边使用的是docker启动的单机模式，直接运行：

~~~
docker run -d --name nacos-standalone -e MODE=standalone -p 8848:8848 nacos/nacos-server:latest
~~~


也可以使用官方提供的 [client](https://github.com/alibaba/nacos/releases) 。

