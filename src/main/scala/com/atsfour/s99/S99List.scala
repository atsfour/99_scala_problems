package com.atsfour.s99

object S99List {

  // P-01
  def last[A](l: List[A]): Option[A] = l match {
    case Nil => None
    case x :: Nil => Some(x)
    case x :: xs => last(xs)
  }

  // P-02
  def penultimate = ???

  // P-03
  def nth = ???

  // P-04
  def length = ???

  // P-05
  def reverse = ???

  // P-06
  def isPalindrome = ???

  // P-07
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

  // P-08
  def compress[A](l: List[A]): List[A] = {
    def go(ll: List[A], prev: Option[A], acc: List[A]): List[A] = (ll, prev) match {
      case (Nil, _) => acc
      case (x :: xs, None) => go(xs, Some(x), x :: acc)
      case (x :: xs, Some(p)) if p == x => go(xs, prev, acc)
      case (x :: xs, Some(p)) => go(xs, Some(x), x :: acc)
    }
    go(l, None, Nil).reverse
  }

  // P-09
  def pack[A](l: List[A]): List[List[A]] = {
    l.foldRight(Nil: List[List[A]])((h, t) => t match {
      case list :: t if list.head == h => (h :: list) :: t
      case _ => List(h) :: t
    })
  }

  // P-10
  def encode[A](l: List[A]): List[(Int, A)] = ???

  // P-11
  def encodeModified = ???

  // P-12
  def decode = ???

  // P-13
  def encodeDirect = ???

  // P-14
  def duplicate = ???

  // P-15
  def duplicateN = ???

  // P-16
  def drop = ???

  // P-17
  def split = ???

  // P-18
  def slice = ???

  // P-19
  def rotate = ???

  // P-20
  def removeAt = ???

  // P-21
  def insertAt = ???

  // P-22
  def range = ???

  // P-23
  def randomSelect = ???

  // P-24
  def lotto = ???

  // P-25
  def randomPermute = ???

  // P-26
  def combinations = ???

  // P-27
  def group3 = ???
  def group = ???

  // P-28
  def lsort = ???
  def lsortFreq = ???

}
