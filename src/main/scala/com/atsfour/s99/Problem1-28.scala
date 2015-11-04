package com.atsfour.s99

import S99List._


object Problem1 extends Solver {
  val problemNum = 1
  val problemDescriptions = List("Find the last element of a list.")
  def inputs = List("List(1, 1, 2, 3, 5, 8)")
  def results = List(last(input).map(_.toString).getOrElse("error: last of Nil"))

  val input = List(1, 1, 2, 3, 5, 8)
}


object Problem7 extends Solver {
  val problemNum = 7
  val problemDescriptions = List("""Flatten a nested list structure.""")
  def inputs = List(input.toString)
  def results = List(flatten(input).toString)

  val input = List(List(1, 1), 2, List(3, List(5, 8)))
}


object Problem8 extends Solver {
  val problemNum = 8
  val problemDescriptions = List("Eliminate consecutive duplicates of list elements.\n" +
    "If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.")
  def inputs = List("List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
  def results = List(compress(input).toString)

  val input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)


}


object Problem9 extends Solver {
  val problemNum = 9
  val problemDescriptions = List(
    """|Pack consecutive duplicates of list elements into sublists.
       |If a list contains repeated elements they should be placed in separate sublists.""")
  def inputs = List("List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
  def results = List(pack(input).toString)

  val input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

}
