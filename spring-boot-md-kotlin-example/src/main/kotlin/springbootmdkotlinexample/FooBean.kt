package springbootmdkotlinexample

class FooBean(private val fooProperty: String, private val fooIntProperty: Int) {

    fun printFoo() {
        println("property is: $fooProperty and $fooIntProperty")
    }
}