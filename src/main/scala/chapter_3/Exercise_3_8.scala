package chapter_3

import chapter_3.List._

object Exercise_3_8 {
  def main(args: Array[String]): Unit = {
    val ls = List(1, 2, 3, 4, 5, 6)
    println(foldRight(ls, Nil: List[Int])(Cons(_,_)))
  }
}
