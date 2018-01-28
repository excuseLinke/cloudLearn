# cloudLearn
#创建
#这是一个基本 的spring cloud Netflix 分布式组件

#项目结构
    -- eureka-server 服务注册中心，提供视图化管理
    -- service-boy 服务提供者
    -- service-ribbon 消费者
        --包含
            -- ribbon 提供负载均衡
            -- Hystrix 断路器
            -- Hystrix Dashboard 断路器仪表,提供视图化管理
    --service-zuul 路由 提供访问分发,服务过滤

#如果需要横向拓展
#有多个服务提供者,多个消费者
#可使用Spring Cloud Sleuth集成的zipkin组件进行服务链路管理
#该组件同时也提供可视化工具

#下面是一个简单的UML图
![image](https://github.com/excuseLinke/cloudLearn/blob/master/tt.png)