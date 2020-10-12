package chapter_3

import chapter_3.List._
import chapter_3.List

object Exercise_3_7 {
  def product(ls: List[Double]): Double = {
    foldRight(ls, 1.0)(((p: Double, q: Double) => {if (p == 0) println("Unstacked"); p * q} ))
  }

  //foldRight must traverse all the way to the end of the list (pushing frames
  //onto the call stack as it goes) before it can begin collapsing it.

  //If the signature is (Int, Int) => Int, (Int, =>Int) => Int is not acceptable. CALL BY NAME
  //Now, what if I change the definition to def foldRight[A, B](ls: List[A], z: B)(f: (A, =>B) => B) : B
  def main(args: Array[String]): Unit = {
    var ls = List(1.0, 2.0, 3.0, 0, 4.0, 5.0, 6.0)
    println(product(ls))
    ls = List()
    println(product(ls))
  }
}
