package com.github.ldaniels528.meansjs.nodejs.tty

import com.github.ldaniels528.meansjs.nodejs.net

import scala.scalajs.js

/**
  * The tty.ReadStream class is a subclass of net.Socket that represents the readable side of a TTY.
  * In normal circumstances process.stdin will be the only tty.ReadStream instance in a Node.js process
  * and there should be no reason to create additional instances.
  */
@js.native
trait ReadStream extends net.Socket {

  /////////////////////////////////////////////////////////////////////////////////
  //      Properties
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * A boolean that is true if the TTY is currently configured to operate as a raw device. Defaults to false.
    * @since 0.7.7
    */
  var isRaw: Boolean = js.native

  /**
    * Turns on/off raw mode
    * @param mode mode If true, configures the tty.ReadStream to operate as a raw device. If false, configures the
    *             tty.ReadStream to operate in its default mode. The readStream.isRaw property will be set to the
    *             resulting mode.
    * @since 0.7.7
    */
  def setRawMode(mode: Boolean): Unit = js.native

}