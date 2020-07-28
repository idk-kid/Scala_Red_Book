package chapter_3

import chapter_3.List._
import chapter_3.List

object Exercise_3_7 {
  def product(ls: List[Double]): Double = {
    foldRight(ls, 1.0)(((p: Double, q: Double) => {println("Unstacked"); p * q} ))
  }

  //foldRight must traverse all the way to the end of the list (pushing frames
  //onto the call stack as it goes) before it can begin collapsing it.
  def main(args: Array[String]): Unit = {
    var ls = List(1.0, 2.0, 3.0, 0, 4.0, 5.0, 6.0)
    println(product(ls))
    ls = List()
    println(product(ls))
  }
}
