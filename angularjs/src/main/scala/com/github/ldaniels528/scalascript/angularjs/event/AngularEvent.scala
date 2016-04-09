package com.github.ldaniels528.nodesjs.angularjs.event

import scala.scalajs.js

/**
  * Angular Event
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait AngularEvent extends js.Object {

  def stopPropagation(): Unit

}
