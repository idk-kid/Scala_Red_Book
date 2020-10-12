package chapter_3
import List.foldRight

object Exercise_3_18 {
  def map[A,B](as: List[A])(f: A => B): List[B] ={
    foldRight(as, Nil:List[B])((a: A, b: List[B]) => Cons(f(a), b))
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1.1, 2.2, 3.3, 4.4)
    println(map(ls)((a:Double) => a.toString))
  }
}
