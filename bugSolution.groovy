```groovy
class MyClass {
    def myMethod(Object arg) {
        if (arg == null) {
            return "Null value"
        } else if (arg instanceof String) {
            return arg.toUpperCase()
        } else {
            return "Invalid input type"
        }
    }
}

assert new MyClass().myMethod(null) == "Null value"
assert new MyClass().myMethod("hello") == "HELLO"
assert new MyClass().myMethod(123) == "Invalid input type"
```