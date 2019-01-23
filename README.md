# spring-cloud-alibaba 学习案例


## 准备工作


### 安装nacos

下载地址： [nacos](https://github.com/alibaba/nacos/releases)


docker方式：

~~~
docker run -d --name nacos-standalone -e MODE=standalone -p 8848:8848 nacos/nacos-server:latest
~~~


启动后访问 `http://127.0.0.1:8848/nacos/` ，进入服务管理页面。


### 使用Nacos作为配置中心


登入控制台，在配置列表中新建配置文件 nacos-server.properties

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