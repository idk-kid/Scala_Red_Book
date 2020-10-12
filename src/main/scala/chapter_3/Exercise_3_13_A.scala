package chapter_3
import Exercise_3_10.foldLeft

object Exercise_3_13_A {
  /*Implement FoldRight with FoldLeft */
  def foldRight[A,B](ls: List[A], z: B)(f: (A, B) => B): B = {
    foldLeft(ls, z)((b: B, a: A) => f(a, b))
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1.0, 2, 0, 3, 4, 5)
    println(foldRight(ls, 1.0)((a: Double, b: Double) => {println("Unstacked"); a * b}))
  }
}
