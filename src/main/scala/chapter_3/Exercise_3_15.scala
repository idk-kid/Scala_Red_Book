package chapter_3
import List.foldRight

object Exercise_3_15 {
  def append[A](lsLeft: List[A], lsRight: List[A]): List[A] = {
    foldRight(lsLeft, lsRight)(Cons(_,_))
  }

  def concat[A](ls : List[List[A]]): List[A] = {
    foldRight(ls, Nil: List[A])(append(_, _))
  }

  def main(args: Array[String]): Unit = {
    val ls1 = List(List(1,2), List(3,4), List(5,6))
    val ls2 = List(List(1,2), List(3,4))
    val ls3 = List(List(1,2))
    val ls4 = List(List())

    println(concat(ls1))
    println(concat(ls2))
    println(concat(ls3))
    println(concat(ls4))
  }
}
