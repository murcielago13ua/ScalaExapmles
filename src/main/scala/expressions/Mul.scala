package main.scala.expressions

class Mul(e1: Expr, e2: Expr) extends Operation(e1, e2, "*") {
  def operation(n1: Int, n2: Int) = n1 * n2
}

object Mul {
  def apply(e1: Expr, e2: Expr) = new Mul(e1, e2)
}