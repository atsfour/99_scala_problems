package com.atsfour.s99

import scala.util.Try

/**
  * Created by atsfour on 2015/11/03.
  */
object Problem1 extends Solver {
  val problemNum = 1
  val problemDescriptions = List("Find the last element of a list.")
  def inputs = List("List(1, 1, 2, 3, 5, 8)")
  def results = List(last(input).map(_.toString).getOrElse("error: last of Nil"))

  val input = List(1, 1, 2, 3, 5, 8)
  def last[A](l: List[A]): Option[A] = l match {
    case Nil => None
    case x :: Nil => Some(x)
    case x :: xs => last(xs)
  }
}
