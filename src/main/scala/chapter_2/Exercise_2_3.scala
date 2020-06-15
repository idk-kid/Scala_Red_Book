package chapter_2

object Exercise_2_3 {
  def curry[A,B,C](f: (A, B) => C): A => (B => C)  = {
    (a: A) => (b: B) => f (a, b)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int) => a + b
    println(sum(2,3))
    println(curry(sum)(2)(3))
  }
}
