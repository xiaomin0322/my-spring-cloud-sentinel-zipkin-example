# Spring Cloud Alibaba


### 目录

1. [安装Nacos](#安装Nacos)

2. [使用Nacos作为配置中心](#使用Nacos作为配置中心)

3. [Sentinel](#Sentinel)



### 已包含的组件

- Nacos：服务发现、配置管理和服务管理

- Feign：声明式服务调用

- Sentinel：流量控制、熔断降级







### 安装Nacos

下载地址： [nacos](https://github.com/alibaba/nacos/releases)

docker：`docker run -d --name nacos-standalone -e MODE=standalone -p 8848:8848 nacos/nacos-server:latest`

访问地址：`http://127.0.0.1:8848/nacos/`





### 使用Nacos作为配置中心


登入控制台，在配置列表中新建配置文件 `nacos-server.properties`

注意：
- 命名规范： ` ${prefix} - ${spring.profiles.active} . ${file-extension} `
- 当 activeprofile 为空时，对应的连接符 - 也将不存在，dataId 的拼接格式变成 ${prefix}.${file-extension}
- 目前只支持 properties 类型



properties内容如下：

~~~
user.id=1
user.name=james
user.age=17
~~~


更多配置请移步 [官方文档](https://github.com/spring-cloud-incubator/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-examples/nacos-example/nacos-config-example/readme-zh.md)




### Sentinel

下载地址： [Sentinel](https://github.com/alibaba/Sentinel/releases)

启动方式：`java -Dserver.port=18080 -Dcsp.sentinel.dashboard.server=localhost:18080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar`

访问地址：`http://localhost:18080/#/dashboard/home`