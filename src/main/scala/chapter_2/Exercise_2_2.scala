package chapter_2

object Exercise_2_2 {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop(a: Int, b: Int): Boolean ={
      if (as.isEmpty) true
      else if (b == as.length) true
      else {
        if (ordered(as(a), as(b))) loop(b, b+1)
        else false
      }
    }
    loop(0,1)
  }

  def main(args: Array[String]): Unit = {
    val array1 = Array(1,2,3,3,4,5)
    val array2 = Array(1,1,1,1,1,1)
    val array3 = array1.reverse
    println(Array(1).length)
    println(Array(1)(0))

    println(isSorted(array1, intSortedAsc))
    println(isSorted(array2, intSortedAsc))
    println(isSorted(array3, intSortedAsc))
    println(isSorted(array1, intSortedDsc))
    println(isSorted(array2, intSortedDsc))
    println(isSorted(array3, intSortedDsc))
    println(isSorted(Array[Int](), intSortedAsc))
    println(isSorted(Array[Int](), intSortedDsc))
  }

  def intSortedAsc(a: Int, b: Int): Boolean = {
    if (b >= a) true else false
  }

  def intSortedDsc(a: Int, b: Int): Boolean = {
    if (b <= a) true else false
  }
}
