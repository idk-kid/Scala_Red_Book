package chapter_3

object Exercise_3_10 {
  def foldLeft[A,B](as: List[A], z: B)(f: (B, A) => B):B = {
    as match {
      case Nil => z
      case Cons(head, tail) => foldLeft(tail, f(z, head))(f)
      /*
      Note that this is tail recursive hence stack safe.
      foldLeft(List(1, 2, 3), 0)((a: Int, b: Int) => a + b)
      foldLeft(Cons(1, Cons(2, Cons(3, Nil))), 0)((a: Int, b: Int) => a + b)
      foldLeft(Cons(2, Cons(3, Nil)), f(0, 1))((a: Int, b: Int) => a + b)
      //Just remember this step. FoldLeft picks head and operates within first.
      // Basically, everything is consumed and evaluated from left to right
       */
    }
  }
}
