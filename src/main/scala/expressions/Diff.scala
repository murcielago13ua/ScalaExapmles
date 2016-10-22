package main.scala.expressions

class Diff(e1: Expr, e2: Expr) extends Operation(e1, e2, "-") {
  def operation(n1: Int, n2: Int): Int = n1 - n2
}

object Diff{
  def apply(e1: Expr, e2: Expr): Diff = new Diff(e1, e2)
}