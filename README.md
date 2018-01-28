# cloudLearn
#创建   </br>
#这是一个基本 的spring cloud Netflix 分布式组件   </br>

#项目结构   </br>
    -- eureka-server 服务注册中心，提供视图化管理   </br>
    -- service-boy 服务提供者   </br>
    -- service-ribbon 消费者   </br>
        --包含   </br>
            -- ribbon 提供负载均衡   </br>
            -- Hystrix 断路器   </br>
            -- Hystrix Dashboard 断路器仪表,提供视图化管理   </br>
    --service-zuul 路由 提供访问分发,服务过滤   </br>

#如果需要横向拓展   </br>
#有多个服务提供者,多个消费者   </br>
#可使用Spring Cloud Sleuth集成的zipkin组件进行服务链路管理   </br>
#该组件同时也提供可视化工具   </br>

#下面是一个简单的UML图   </br>
![image](https://github.com/excuseLinke/cloudLearn/blob/master/tt.png)