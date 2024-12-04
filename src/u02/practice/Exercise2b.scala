package u02.practice

val neg: (String => Boolean) => (String => Boolean) = predicate => !predicate(_)
def negMethod(predicate: String => Boolean): String => Boolean = !predicate(_)
def negMethodGeneric[T](predicate: T => Boolean): T => Boolean = !predicate(_)

object Exercise2b extends App:
  /*
  val notEmpty = neg(empty)
  val notEmpty = negMethod(empty)*/
  val empty: String => Boolean = _ == ""
  val notEmpty = negMethodGeneric(empty)
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) //true