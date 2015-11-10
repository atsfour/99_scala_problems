package com.atsfour.s99

import org.json4s.native.Json
import scala.util.{Failure, Success, Try}
import scala.reflect.runtime.{universe => ru}

/**
  * Created by atsfour on 2015/11/03.
  */
object Main extends App {

  val problemFile = "s99.json"

  @scala.annotation.tailrec
  def loop: Unit = {
    val in = scala.io.StdIn.readLine("input problem number (1 to 99), or 'q' to quit: ")
    in match {
      case "q" => println("quit.")
      case s => {
        Try(s.toInt) match {
          case Failure(_) => println("invalid input")
          case Success(n) if (n > 99 || n <= 0) => println("invalid problem number.")
          case Success(n) => Try(callSolver(n)) match {
            case Success(s) => s.display
            case Failure(_) => println("not implemented")
          }
        }
        loop
      }
    }
  }

  def callSolver(num: Int): Problem = {
    def objectName = "com.atsfour.s99.Problem" + num.toString
    def runtimeMirror = ru.runtimeMirror(getClass.getClassLoader)
    def module = runtimeMirror.staticModule(objectName)
    def obj = runtimeMirror.reflectModule(module)
    obj.instance.asInstanceOf[Problem]
  }

  def readFromFile(fileName: String): Json = {
    try{
      val stream = getClass.getResourceAsStream(fileName)
      val json: Json = parsescala.io.Source.fromInputStream(stream).toString()
    }
  }

  def problems: Map[Int, Problem] = ???

  loop
}
