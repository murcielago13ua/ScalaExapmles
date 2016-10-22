package main.scala.expressions

trait Expr {
  def eval: Int = this match{
    case Num(n) => n
    case Operation(leftOp, (operation, _), rightOp) => operation (leftOp eval, rightOp eval)
  }

  def show: String = this match {
    case Num(n) => s"$n"
    case Var(x) => x
    case Operation(leftOp, (_, str), rightOp) => s"(${leftOp.show} ${str} ${rightOp.show})"
  }
}
