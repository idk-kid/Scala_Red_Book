package chapter_3

import chapter_3.List._

object Exercise_3_2 {
  def tail[A](ls: List[A]): List[A] = {
    ls match{
      case Nil => sys.error("tail of empty list")
      case Cons(a, b) => b
    }
  }

  def main(args: Array[String]): Unit = {
    println(tail(List(1,2,3)))
    println(tail(Nil))
  }
}
