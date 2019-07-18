package springbootmdkotlinexample.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springbootmdkotlinexample.FooBean

@EnableConfigurationProperties(FooPropertiesOk::class, FooPropertiesNotOk::class)
@Configuration
class FooConfig {

    @Bean
    fun fooBean(fooPropertiesOk: FooPropertiesOk, fooPropertiesNotOk: FooPropertiesNotOk) = FooBean(fooPropertiesNotOk.fooStringProperty, fooPropertiesOk.fooIntProperty)
}