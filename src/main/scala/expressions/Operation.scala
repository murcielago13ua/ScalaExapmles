package main.scala.expressions

abstract class Operation(val leftOp: Expr, val rightOp: Expr, private val opString: String) extends Expr {
  def operation(n1: Int, n2: Int): Int
}

object Operation {
  def unapply(op: Operation): Option[(Expr, ((Int, Int) => Int, String), Expr)] = {
    val x: (Int, Int) => Int = op.operation
    Some((op.leftOp, (x, op.opString), op.rightOp))
  }
}
