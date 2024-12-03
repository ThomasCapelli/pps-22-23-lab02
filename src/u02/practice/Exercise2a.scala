package u02.practice

val checkPositivity = (x: Int) => x match
  case x if x >= 0 => "positive"
  case _ => "negative"
def checkPositiveNumber: (x: Int) => String = _ match
  case x if x >= 0 => "positive"
  case _ => "negative"

object Exercise2a extends App:
  val negativeNumber = -1
  val positiveNumber = 0

  println(checkPositivity(-1))
  println(checkPositiveNumber(-1))