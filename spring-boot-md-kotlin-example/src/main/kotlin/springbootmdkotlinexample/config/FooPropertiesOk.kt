package springbootmdkotlinexample.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "spring.foo.ok")
data class FooPropertiesOk(
        val fooIntProperty: Int = 1,
        val fooNoDefaultProperty: String?, // ="2" in case that this line is commented out metadata are not generated (or in case that default value is assigned)
        val fooStringProperty: String = "fooVal"  //interesting that for this property metadata are generated
)