# 持久层
    jpa
    h2
# springcloud版本
    Edgware
# springmaven插件 
    spring-boot-maven-plugin
# idea代码模板
    类模板 File -> Settings -> Editor -> File and Code Templates
# Spring Initializr快速创建springboot项目
    http://start.spring.io/
# RestTemplate
    @since 3.0
    getForEntity() 发送一个HTTP GET请求，返回的ResponseEntity包含了响应体所映射成的对象
    getForObject() 发送一个HTTP GET请求，返回的请求体将映射为一个对象
    postForEntity() 
    POST 数据到一个URL，返回包含一个对象的ResponseEntity，这个对象是从响应体中映射得 
    到的
    postForObject() POST 数据到一个URL，返回根据响应体匹配形成的对象
# SpringBoot Actuator
# 配置文件引入pom文件声明的变量
    #info:
    #  app:
    #    name: @project.artifactId@
    #    encoding: @project.build.sourceEnCoding@
    #    java:
    #      source: @java.version@
    #      target: @java.version@


