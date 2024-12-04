package u02.practice

object Exercise3a extends App:
  def gcd(a: Int, b: Int): Int = (a, b) match
    case _ if b == 0 => a
    case (a, b) if a > b => gcd(b, a % b)

  println(gcd(14,7)) // 7
  println(gcd(12, 8)) //4
  println(gcd(2, 3))