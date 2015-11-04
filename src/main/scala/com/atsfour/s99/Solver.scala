package com.atsfour.s99

trait Solver {
  val problemNum: Int
  val problemDescriptions: List[String]
  def inputs: List[String]
  def results: List[String]
  def display: Unit = {
    for (
      ((p, i), r) <- problemDescriptions.zip(inputs).zip(results)
    ){
      println("description: " + p)
      println("input : " + i)
      println("result: " + r)
    }
  }

}