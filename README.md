# Groovy Type Handling Exception

This example demonstrates a common issue in Groovy related to its dynamic typing.  The `myMethod` in `MyClass` expects a String argument but doesn't explicitly handle non-String inputs. When an integer (123) is passed, Groovy's runtime attempts to invoke `toUpperCase()` on the Integer, leading to a `groovy.lang.MissingMethodException`.

The solution shows how to add robust input validation or leverage Groovy's type coercion features to prevent the exception.