package chapter_3

import chapter_3.Exercise_3_2.tail

object Exercise_3_4 {
  def drop[A](ls: List[A], n: Int): List[A] = {
    ls match {
      case Nil => sys.error("list is empty or out of elements to drop")
      case Cons(_, b) => if (n == 0) {
        ls
      }else{
        drop(b, n - 1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(drop(List(1,2,3,4,5,6,7), 6))
//    println(drop(List(1,2,3,4,5,6,7), 8))
    println(drop(Nil, 10))
  }
}
