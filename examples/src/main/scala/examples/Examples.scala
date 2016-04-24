package examples

import com.github.ldaniels528.meansjs.nodejs._
import examples.nodejs.{events, express, http, net, _}
import org.scalajs.dom.console

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

/**
  * MEANS.js Examples
  * @author lawrence.daniels@gmail.com
  */
@JSExportAll
object Examples extends js.JSApp {
  private val examples = js.Array(
    "Buffers", "EventEmitterExample", "ExpressRoutingExample", "ExpressServerExample",
    "HttpServerExample", "IntermediateTimers", "MongoClientExample", "NetServerExample",
    "ProducerExample", "ProducerEnhanced", "REPLExample", "TinyCLI", "TransactionExample"
  )

  override def main(): Unit = ()

  def start(require: Require, scope: js.Dynamic) {
    val args = process.argv.drop(2)
    if (args.isEmpty) usageError()
    else {
      args map { arg => console.log(s"Executing example '$arg'"); arg } foreach {
        case "Buffers" => new buffers.Buffers(require)
        case "Classes" => new basics.Classes(require)
        case "EventEmitterExample" => new events.EventEmitterExample(require, scope)
        case "ExpressRoutingExample" => new express.ExpressRoutingExample(require)
        case "ExpressServerExample" => new express.ExpressServerExample(require)
        case "Files" => new basics.Files(require)
        case "HttpServerExample" => new http.HttpServerExample(require)
        case "IntermediateTimers" => new timers.IntermediateTimers(require)
        case "MongoClientExample" => new mongodb.MongoClientExample(require)
        case "NetServerExample" => new net.NetServerExample(require)
        case "ProducerExample" => new kafka.ProducerExample(require)
        case "ProducerEnhanced" => new kafka.ProducerEnhanced(require)
        case "REPLExample" => new repl.REPLExample(require)
        case "StateExample" => new zookeeper.StateExample(require)
        case "StringDecoderExample" => new StringDecoderExample(require)
        case "TinyCLI" => new repl.TinyCLI(require)
        case "TransactionExample" => new zookeeper.TransactionExample(require)
        case arg => usageError()
      }
    }
  }

  def usageError(): Unit = {
    val choices = examples.sliding(4, 4) map (_.mkString(", ")) mkString "\n"
    console.warn("Usage: examples.js <example1>[, <example2>[, <exampleN>]]\n")
    console.log("Choose any of the following:")
    console.log(choices)
  }

}
