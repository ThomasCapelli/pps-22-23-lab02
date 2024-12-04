package u02.practice

object Exercise4 extends App:

  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)
    case Square(size: Double)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Shape.Square(size) => size * 4
      case Shape.Rectangle(b, h) => (b + h) * 2
      case Shape.Circle(r) => 2 * r * Math.PI

  import Shape.*

  val rect: Shape = Shape.Rectangle(5, 10)
  println(perimeter(rect))
