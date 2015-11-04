package com.atsfour.s99

/**
  * Created by atsfour on 2015/11/04.
  */
object Problem7 extends Solver {
  val problemNum = 7
  val problemDescriptions = List("""Flatten a nested list structure.""")
  def inputs = List(input.toString)
  def results = List(flatten(input).toString)

  val input = List(List(1, 1), 2, List(3, List(5, 8)))
  def flatten(l: List[Any]): List[Any] = {
    def go(ll: List[Any], acc: List[Any]): List[Any] = ll match {
      case Nil => acc
      case hl :: tl => hl match {
        case Nil => acc
        case x :: xs => go(tl, Nil) ++ go(x :: xs, acc)
        case a => go(tl, a :: acc)
      }
    }
    go(l, Nil).reverse
  }
}
