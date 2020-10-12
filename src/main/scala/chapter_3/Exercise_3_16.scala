package chapter_3

import List.foldRight

object Exercise_3_16 {
  def addOne(ls: List[Int]): List[Int] = {
    foldRight(ls, Nil: List[Int])(( a: Int, b: List[Int]) => Cons(a + 1 , b))
  }

  def main(args: Array[String]): Unit = {
    val ls1 = List(1,2,3,4)

    println(addOne(ls1))
  }

}
