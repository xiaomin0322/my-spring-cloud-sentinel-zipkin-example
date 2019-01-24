# Spring Cloud Alibaba 学习案例


## 目录

1. [安装nacos](#安装nacos)

2. [使用Nacos作为配置中心](#使用Nacos作为配置中心)




### 已包含的组件

- Nacos：阿里巴巴开源产品，一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台

- Feign：声明式服务调用


### 待添加组件

- Sentinel：阿里巴巴开源产品，把流量作为切入点，从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性




### 安装nacos

下载地址： [nacos](https://github.com/alibaba/nacos/releases)


docker方式：

~~~
docker run -d --name nacos-standalone -e MODE=standalone -p 8848:8848 nacos/nacos-server:latest
~~~


启动后访问 `http://127.0.0.1:8848/nacos/` ，进入服务管理页面。


### 使用Nacos作为配置中心


登入控制台，在配置列表中新建配置文件 `nacos-server.properties`

注意：
- 命名规范： ` ${prefix} - ${spring.profiles.active} . ${file-extension} `
- 当 activeprofile 为空时，对应的连接符 - 也将不存在，dataId 的拼接格式变成 ${prefix}.${file-extension}
- 目前只支持 properties 类型



properties内容如下：

~~~properties
user.id=1
user.name=james
user.age=17
~~~



更多配置请移步 [官方文档](https://github.com/spring-cloud-incubator/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-examples/nacos-example/nacos-config-example/readme-zh.md)