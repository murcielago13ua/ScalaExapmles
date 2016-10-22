package main.scala.expressions

class Num(val numValue: Int) extends Expr

object Num{
  def apply(n: Int) = new Num(n)

  def unapply(num: Num): Option[Int] = Some(num.numValue)
}
