package com.atsfour.s99

/**
  * Created by kida on 2015/11/04.
  */
object Problem9 extends Solver {
  val problemNum = 9
  val problemDescriptions = List(
    """|Pack consecutive duplicates of list elements into sublists.
       |If a list contains repeated elements they should be placed in separate sublists.""")
  def inputs = List("List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
  def results = List(pack(input).toString)

  val input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def pack[A](l: List[A]): List[List[A]] = {
    l.foldRight(Nil: List[List[A]])((h, t) => t match {
      case list :: t if list.head == h => (h :: list) :: t
      case _ => List(h) :: t
    })
  }
}
