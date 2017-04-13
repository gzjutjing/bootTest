ribbon负载均衡使用eureka注册
客户端工程：ribbonEureka和ribbonEureka2
流程：
    1、client启动，通过applicationName注册到eureka
    2、工程注册到eureka后，loadbalance获取eureka注册服务的列表
    3、默认是间隔访问不同服务