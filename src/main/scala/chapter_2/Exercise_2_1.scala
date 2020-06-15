package chapter_2

object Exercise_2_1 {
  def fib(n: Int): Int = {
    if( n < 0) -1
    else if(n == 0) 0
    else if (n == 1) 1
    else {
      def loop(prev: Int, curr: Int, sum: Int, i: Int): Int = {
        if (i == 0) sum
        else loop(curr, prev + curr, sum + prev + curr, i - 1)
      }

      loop(0, 1, 1, n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    for(i <- 0 to 5) {
      println(s"Fib $i th sum = ${fib(i)}")
    }
  }
}
