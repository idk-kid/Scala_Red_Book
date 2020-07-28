package chapter_3

import chapter_3.List

object Exercise_3_5 {
  def dropWhile[A](ls: List[A], p: A => Boolean): List[A] = {
    //Note Exercise is implemented wrongly because it doesn't know if input is an empty List
    ls match {
      case Nil => sys.error("input list is empty")
      case Cons(a, Nil) => if (p(a)) Nil else ls
      case Cons(a, b) => if (p(a)) dropWhile(b, p) else ls
    }
  }

  def main(args: Array[String]): Unit = {
    println(dropWhile(List(2,4,6,8,10,20,34,55,66), (n: Int) => if(n % 2 == 0) true else false))
    println(dropWhile(List(2,4,6), (n: Int) => if(n % 2 == 0) true else false))
    println(dropWhile(Nil, (n: Int) => if(n % 2 == 0) true else false))
  }
}
