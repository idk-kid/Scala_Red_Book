package chapter_3
import List.foldRight

object Exercise_3_13_B {
  /*FoldLeft with FoldRight */
  def foldLeft[A, B](ls: List[A], z: B)(f: (B, A) => B): B ={
    foldRight(ls, z)((a: A, b: B) => f(b, a))
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1.0, 2, 0, 3, 4, 5)
    println(foldRight(ls, 1.0)((a: Double, b: Double) => {println("Unstacked"); a * b}))
  }
}
