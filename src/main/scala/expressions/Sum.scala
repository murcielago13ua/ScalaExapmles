package main.scala.expressions

class Sum(e1: Expr, e2: Expr) extends Operation(e1, e2, "+") {
  def operation(n1: Int, n2: Int) = n1 + n2
}

object Sum {
  def apply(e1: Expr, e2: Expr) = new Sum(e1, e2)
}