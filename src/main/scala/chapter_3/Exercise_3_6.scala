package chapter_3

object Exercise_3_6 {

  // This function cannot be run is constant time as its a singly linked list to know whats the last element,
  // we need to traverse till the last element. Therefore it cannot be implemented in constant time like tail
  def init[A](ls: List[A]): List[A] = {
    ls match{
      case Nil => sys.error("Input list is empty")
      case Cons(_, Nil) => Nil
      case Cons(a, b) => Cons(a, init(b))
    }
  }

  def main(args: Array[String]): Unit = {
    println(init(List(1,2,3,4,5)))
    println(init(List(1)))
    println(init(Nil))
  }
}
