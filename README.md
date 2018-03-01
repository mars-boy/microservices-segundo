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

## zipkin-service
It is used to trace a request as it pass it through number of microservices and measure processing time in each microservice you can find more details [here](https://github.com/openzipkin/zipkin)

## account-service
It's just a simple microservice that deal with accounts domain.

## expenses-service
It's simple microservice that deal with expenses domain this microservices give idea about how to implement FeignClient and fallback methods.
You can find more details about FeignClient [here](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)

## deepLearnSideCar
It's a sidecar application which enables non-jvm application to communicate with other microservices. Explains concept of polyglot microservices.
This should contain information about non-jvm microservice running port
You can find more details about sidecar [here](https://cloud.spring.io/spring-cloud-netflix/multi/multi__polyglot_support_with_sidecar.html)

## dlearn-Python-service
It's a python flask application running on 8012 port for this to communicate with other microservice there should be sidecar application that knows the port it was running on.

#### References
* [Kenny Bastani](http://www.kennybastani.com/search/label/microservices)
* [Chris Richardson](http://microservices.io/patterns/microservices.html)
* [Erik Lupander - Magnus Larsson](http://callistaenterprise.se/blogg/teknik/2015/05/20/blog-series-building-microservices/)
* [Josh Long](https://github.com/joshlong/bootiful-microservices)
* [Arun Gupts](https://github.com/arun-gupta/microservices)
