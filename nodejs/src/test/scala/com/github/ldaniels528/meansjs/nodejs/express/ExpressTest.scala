package com.github.ldaniels528.meansjs.nodejs.express

import com.github.ldaniels528.meansjs.nodejs.require
import org.scalajs.dom.console

import scala.scalajs.js

/**
  * Express Test Server
  * @author lawrence.daniels@gmail.com
  */
class ExpressTest {

  val express = require[Express]("express")
  val app = express()

  app.get("/", (req: Request, res: Response) => {
    res.send("Hello World")
  })

  val server = app.listen(8081, connect)

  private def connect: js.Function = () => {
    val host = server.address().address
    val port = server.address().port

    console.log("Example app listening at http://%s:%s", host, port)
  }

  /*
    var express = require('express');
    var app = express();

    app.get('/', function (req, res) {
       res.send('Hello World');
    })

    var server = app.listen(8081, function () {

      var host = server.address().address
      var port = server.address().port

      console.log("Example app listening at http://%s:%s", host, port)

    })
   */

}
