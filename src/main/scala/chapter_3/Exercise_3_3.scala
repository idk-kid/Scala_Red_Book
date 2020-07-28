package chapter_3

object Exercise_3_3 {
  def setHead[A](ls: List[A], headValue: A): List[A] = {
    ls match {
      case Nil => sys.error("list is empty")
      case Cons(_, b) => Cons(headValue, b)
    }
  }

  def main(args: Array[String]): Unit = {
    println(setHead(List(4,2,3,4), 1))
    println(setHead(Nil, 3))
  }
}
