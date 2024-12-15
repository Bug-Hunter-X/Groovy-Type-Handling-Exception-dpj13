```groovy
class MyClass {
    def myMethod(String arg) {
        if (arg == null) {
            return "Null value"
        } else {
            return arg.toUpperCase()
        }
    }
}

assert new MyClass().myMethod(null) == "Null value"
assert new MyClass().myMethod("hello") == "HELLO"

//The following will throw an exception in Groovy
println new MyClass().myMethod(123)
```