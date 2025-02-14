```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    println(obj.myMethod(10)) // This will print 15
    println(obj.x) // This will print 5
    //To make it truly immutable,  we should prevent any indirect access to the underlying data.
  }
}
```