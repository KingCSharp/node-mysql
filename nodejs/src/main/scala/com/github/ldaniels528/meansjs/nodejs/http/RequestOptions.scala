package com.github.ldaniels528.meansjs.nodejs.http

import com.github.ldaniels528.meansjs.util.ScalaJsHelper._

import scala.scalajs.js

/**
  * Client Request Options
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait RequestOptions extends js.Object {
  /** Protocol to use. Defaults to 'http:'. */
  var protocol: js.UndefOr[String] = js.native

  /** Alias for host. To support url.parse() hostname is preferred over host. */
  var host: js.UndefOr[String] = js.native

  /** Alias for host. To support url.parse() hostname is preferred over host. */
  var hostname: js.UndefOr[String] = js.native

  /** IP address family to use when resolving host and hostname. Valid values are 4 or 6. When unspecified, both IP v4 and v6 will be used. */
  var family: js.UndefOr[String] = js.native

  /** Port of remote server. Defaults to 80. */
  var port: js.UndefOr[Int] = js.native

  /** Local interface to bind for network connections. */
  var localAddress: js.UndefOr[String] = js.native

  /** Unix Domain Socket (use one of host:port or socketPath). */
  var socketPath: js.UndefOr[String] = js.native

  /** A string specifying the HTTP request method. Defaults to 'GET'. */
  var method: js.UndefOr[String] = js.native

  /** Request path. Defaults to '/'. Should include query string if any. E.G. '/index.html?page=12'. An exception is thrown when the request path contains illegal characters. Currently, only spaces are rejected but that may change in the future. */
  var path: js.UndefOr[String] = js.native

  /** An object containing request headers. */
  var headers: js.UndefOr[js.Object] = js.native

  /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
  var auth: js.UndefOr[String] = js.native

  /** Controls Agent behavior. When an Agent is used request will default to Connection: keep-alive. Possible values: */
  var agent: js.UndefOr[String] = js.native

  /**
    * A function that produces a socket/stream to use for the request when the agent option is not used.
    * This can be used to avoid creating a custom Agent class just to override the default createConnection function.
    * @see [[Agent.createConnection() ]]
    */
  var createConnection: js.UndefOr[js.Function] = js.native

}

/**
  * Client Request Options Companion
  * @author lawrence.daniels@gmail.com
  */
object RequestOptions {

  def apply(protocol: js.UndefOr[String] = js.undefined,
            host: js.UndefOr[String] = js.undefined,
            hostname: js.UndefOr[String] = js.undefined,
            family: js.UndefOr[String] = js.undefined,
            port: js.UndefOr[Int] = js.undefined,
            localAddress: js.UndefOr[String] = js.undefined,
            socketPath: js.UndefOr[String] = js.undefined,
            method: js.UndefOr[String] = js.undefined,
            path: js.UndefOr[String] = js.undefined,
            headers: js.UndefOr[js.Object] = js.undefined,
            auth: js.UndefOr[String] = js.undefined,
            agent: js.UndefOr[String] = js.undefined) = {
    val options = makeNew[RequestOptions]
    options.protocol = protocol
    options.host = host
    options.hostname = hostname
    options.family = family
    options.port = port
    options.localAddress = localAddress
    options.socketPath = socketPath
    options.method = method
    options.path = path
    options.headers = headers
    options.auth = auth
    options.agent = agent
    options
  }

}