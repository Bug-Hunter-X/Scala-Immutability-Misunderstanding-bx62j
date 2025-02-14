# Scala Immutability Bug

This repository demonstrates a common misunderstanding of immutability in Scala.  The example showcases a seemingly immutable `val` that can be indirectly modified.  The solution provides a corrected approach to achieve true immutability.

## Bug Description:

The bug lies in the misconception that declaring a `val` in a class automatically makes the object immutable. While the `val` is immutable *within the instance of the class*, changes made outside might still affect the object's state. This particular example doesn't demonstrate a direct modification, but rather highlights that external modifications to objects referred to by the object might cause the class object's state to change. 

## Solution:

The solution modifies the code to prevent unintended changes to the `MyClass` object by ensuring that all references to `x` are to truly immutable values and no external modification to an object referenced inside `MyClass` can change the class's state.