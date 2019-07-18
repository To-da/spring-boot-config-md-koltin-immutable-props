package springbootmdkotlinexample.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "spring.foo.notok")
data class FooPropertiesNotOk(
//        @DefaultValue("fooDefault")
        val fooStringProperty: String = "fooDefault", //in case of not adding default value metadata are generated (it works only with annotation @DefaultValue)
        val fooIntProperty: Int = 1
)