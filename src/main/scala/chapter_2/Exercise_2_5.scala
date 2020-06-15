package chapter_2

object Exercise_2_5 {
  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }

  def main(args: Array[String]): Unit = {
    val add2 = (a: Int) => a + 2
    val mul2 = (b: Int) => b * 2

    println(mul2(add2(2)))
    // order of functions matter as f then g and g then f can be different
    println(compose(mul2, add2)(2))
  }
}
