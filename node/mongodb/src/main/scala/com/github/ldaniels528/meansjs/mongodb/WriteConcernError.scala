package com.github.ldaniels528.meansjs.mongodb

import scala.scalajs.js

/**
  * Write Concern Error
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait WriteConcernError extends js.Object {
  /** Write concern error code. */
  var code: Integer = js.native

  /** Write concern error message. */
  var errmsg: String = js.native

}

