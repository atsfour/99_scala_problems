package com.atsfour.s99

/**
  * Created by kida on 2015/11/04.
  */
object Problem8 extends Solver {
  val problemNum = 8
  val problemDescriptions = List("Eliminate consecutive duplicates of list elements.\n" +
    "If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.")
  def inputs = List("List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
  def results = List(compress(input).toString)

  val input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def compress[A](l: List[A]): List[A] = {
    def go(ll: List[A], prev: Option[A], acc: List[A]): List[A] = (ll, prev) match {
      case (Nil, _) => acc
      case (x :: xs, None) => go(xs, Some(x), x :: acc)
      case (x :: xs, Some(p)) if p == x => go(xs, prev, acc)
      case (x :: xs, Some(p)) => go(xs, Some(x), x :: acc)
    }
    go(l, None, Nil).reverse
  }
}
