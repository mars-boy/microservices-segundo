# Microservices
I just tried to implement all microservices concepts into one simple project which will come in handy for developers who wanted to Learn and implement.

## Modules
- [config](#config)
- [discovery-service](#discovery-service)
- [gateway-service](#gateway-service)
- [zipkin-service](#zipkin-service)
- [account-service](#account-service)
- [expenses-service](#expenses-service)
- [deepLearnSideCar](#deepLearnSideCar)
- [dlearn-Python-service](#dlearn-Python-service)

## config
This service externalize all other microservice configuration i used classpath implementation other than git lookup for configurations.

## discovery-service
It's just eureka server just a proxy based api gateway you can find more details [here](https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance)

## gateway-service
Zuul acts as an API gateway. It takes requests coming from external sources(UI) and delegate it to internal microservices you can find more details [here](https://github.com/Netflix/zuul)

 
