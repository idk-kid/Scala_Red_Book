package chapter_3

import List.foldRight

object Exercise_3_9 {
  def length[A](as: List[A]): Int = {
    foldRight(as, 0)((_: A, b: Int) => 1 + b)
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1, 2, 3, 4, 5, 6)
    println(length(ls))
    ls = List()
    println(length(ls))
  }
}
