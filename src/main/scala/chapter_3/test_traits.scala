package chapter_3

trait test_traits{
  def abc() = println("abc")
}

object test_traits {
  override def abc() = println("def") 
}
