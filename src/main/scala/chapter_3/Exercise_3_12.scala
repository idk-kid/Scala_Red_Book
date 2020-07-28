package chapter_3

import Exercise_3_10.foldLeft
import List.foldRight

object Exercise_3_12 {
  def reverse[A](ls: List[A]): List[A] = {
    // Note that Nil needs to be tagged as type List[A]
    foldLeft(ls, List[A]())((b: List[A], a: A) => Cons(a, b))
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1, 2, 3, 4, 5)
    println(reverse(ls))
    ls = List()
    println(reverse(ls))
  }
}
