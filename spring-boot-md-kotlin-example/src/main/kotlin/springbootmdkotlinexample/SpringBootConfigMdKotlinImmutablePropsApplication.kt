package springbootmdkotlinexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootConfigMdKotlinImmutablePropsApplication

fun main(args: Array<String>) {
	val appContext = runApplication<SpringBootConfigMdKotlinImmutablePropsApplication>(*args)
	appContext.getBean(FooBean::class.java).printFoo()
}
