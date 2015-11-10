package com.atsfour.s99

case class Problem(problemNum: Int,
                   problemDescriptions: List[String],
                   inputs: List[String],
                   results: List[String]) {
  def display: Unit = {
    for (
      ((p, i), r) <- problemDescriptions.zip(inputs).zip(results)
    ) {
      println("description: " + p)
      println("input : " + i)
      println("result: " + r)
    }
  }
}