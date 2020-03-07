package com.fpinscala.chapter.four

sealed trait Option[+A] {
    def map[B](f: A => B): Option[B] = this match {
        case Some(get) => Some(f(get))
        case None => None
    }

    def getOrElse[B >: A](default: => B): B = this match {
        case Some(get) => get
        case None => default
    }

    def flatMap[B](f: A => Option[B]): Option[B]
    def orElse[B >: A](ob: => Option[B]): Option[B]
    def filter(f: A => Boolean): Option[A]
}

case class Some[+A](get: A) extends Option[A] {
    override def flatMap[B](f: A => Option[B]): Option[B] = f(get)

    override def orElse[B >: A](ob: => Option[B]): Option[B] = Some(get)

    override def filter(f: A => Boolean): Option[A] = if (f(get)) Some(get) else None
}

case object None extends Option[Nothing] {
    override def flatMap[B](f: Nothing => Option[B]): Option[B] = None

    override def orElse[B >: Nothing](ob: => Option[B]): Option[B] = ob

    override def filter(f: Nothing => Boolean): Option[Nothing] = None
}

object Option {
    def apply[A](get: A) = get match {
        case null => None
        case _ => Some(get)
    }
}

