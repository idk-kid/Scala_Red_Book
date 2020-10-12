package chapter_3
import List.foldRight
import Exercise_3_10.foldLeft

object Exercise_3_19 {
  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    foldRight(as, Nil: List[A])((a: A, b: List[A]) => if (f(a)) b else Cons(a, b) )
  }

//  def filter2[A](as: List[A])(f: A => Boolean): List[A] = {
//    foldLeft(as, Nil: List[A])((b: List[A] , a: A) => if (f(a)) b else Cons(a, b))
//  }


  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5,6,7,8,10)
    println(filter(ls)((a: Int) => if (a%2 ==0) true else false))
//    println(filter2(ls)((a: Int) => if (a%2 ==0) true else false))
  }
}
