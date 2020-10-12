package chapter_3
import List.foldRight

object Exercise_3_14 {
  // append with fold right Appends type A value to List[A]
  def append[A](ls: List[A], z: A): List[A] ={
    foldRight(ls, List(z))((a: A, b: List[A]) =>  Cons(a, b))
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5)
    println(append(ls, 6))
  }
}
