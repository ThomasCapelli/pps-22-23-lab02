package u02.practice

val p1Currying: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
val p1: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

object Exercise2c extends App:

  def p2(x: Int, y: Int, z: Int): Boolean = x <= y && y == z

  def p2Currying(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def genericCompose[T](f: T => T, g: T => T): T => T = t => f(g(t))

  println(p1Currying(10)(10)(10))
  println(p1(10, 11, 10))
  println(p2(10, 10, 11))
  println(p2Currying(10)(10)(10))
  println(compose(_ - 1, _ * 2)(5))
  println(genericCompose[Int](_ - 1, _ * 2)(5))