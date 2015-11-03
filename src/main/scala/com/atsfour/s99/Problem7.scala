package com.atsfour.s99

/**
  * Created by atsfour on 2015/11/04.
  */
object Problem7 {
  val problemNum = 7
  val problemDescriptions = List("""Flatten a nested list structure.""")
  def inputs = List("List(List(1, 1), 2, List(3, List(5, 8)))")
  def results = List(flatten(input).toString)

  val input = List(List(1, 1), 2, List(3, List(5, 8)))
  def flatten(l: List[Any]): List[Any] = ???
}
