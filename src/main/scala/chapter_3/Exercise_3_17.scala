package chapter_3

import List.foldRight

object Exercise_3_17 {
  def convertToString(ls: List[Double]): List[String] = {
    foldRight(ls, Nil: List[String])(( a: Double, b: List[String]) => Cons(a.toString , b))
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1.1, 2.2, 3.3, 4.4)
    println(convertToString(ls))
  }
}
