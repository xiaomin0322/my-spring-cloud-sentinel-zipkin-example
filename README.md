# spring-cloud-alibaba 学习案例

## 准备工作
首先准备nacos server，我这边使用的是docker启动的单机模式，直接运行：

~~~
docker run --name nacos-standalone -e MODE=standalone -p -d 8848:8848 nacos/nacos-server:latest
~~~

