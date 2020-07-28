package chapter_3

import Exercise_3_10.foldLeft

object Exercise_3_11 {
  def sum(ls: List[Int]): Int = {
    foldLeft(ls, 0)((a: Int, b: Int) => a + b)
  }

  def product(ls: List[Double]): Double = {
    foldLeft(ls, 1.0)((a: Double, b: Double) => a * b)
  }

  def length[A](ls: List[A]): Int = {
    foldLeft(ls, 0)(( b: Int, a: A) => b + 1)
  }

  def main(args: Array[String]): Unit = {
    var as = List(1, 2, 3, 4, 5)
    println(sum(as))
    as = List()
    println(sum(as))
    var ls = List(1.0, 2.0, 3.0, 4.0, 5.0)
    println(product(ls))
    ls = List(1.0, 2.0, 3.0, 0, 4.0, 5.0, 6.0)
    println(product(ls))
    ls = List()
    println(product(ls))
    ls = List(1, 2, 3, 4)
    println(length(ls))
    ls = List()
    println(length(ls))
  }
}
