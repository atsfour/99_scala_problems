package com.atsfour.s99

import scala.util.{Failure, Success, Try}
import scala.reflect.runtime.{universe => ru}

/**
  * Created by atsfour on 2015/11/03.
  */
object Main extends App {

  @scala.annotation.tailrec
  def roop: Unit = {
    val in = scala.io.StdIn.readLine("input problem number (1 to 99), or 'q' to quit: ")
    in match {
      case "q" => println("quit.")
      case s => {
        Try(s.toInt) match {
          case Failure(_) => println("invalid input")
          case Success(n) if (n > 99 || n <= 0) => println("invalid problem number.")
          case Success(n) => callSolver(n) match {
            case Success(s) => s.display
            case Failure(_) => println("not implemented")
          }
        }
        roop
      }
    }
  }

  def callSolver(num: Int): Try[Solver] = {
    val objectName = "com.atsfour.s99.Problem" + num.toString
    val runtimeMirror = ru.runtimeMirror(getClass.getClassLoader)
    val module = runtimeMirror.staticModule(objectName)
    val obj = runtimeMirror.reflectModule(module)
    Try(obj.instance.asInstanceOf[Solver])
  }

  roop
}
