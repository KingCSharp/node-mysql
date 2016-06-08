package com.github.ldaniels528.meansjs.nodejs.tty

import com.github.ldaniels528.meansjs.nodejs.net._

import scala.scalajs.js

/**
  * The tty module provides the tty.ReadStream and tty.WriteStream classes. In most cases, it will not be necessary
  * or possible to use this module directly.
  */
@js.native
trait TTY extends js.Object {

  /**
    * The tty.isatty() method returns true if the given fd is associated with a TTY and false if is not.
    * @param fd A numeric file descriptor
    * @since 0.5.8
    */
  def isatty(fd: FileDescriptor): Boolean = js.native

}
