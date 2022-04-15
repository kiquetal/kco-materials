import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {

  /*
   * GlobalScope.launch() is a shortcut for the following code:
   */
  (1..10000).forEach {
    GlobalScope.launch {
      val threadName = Thread.currentThread().name
      println("$it printed on thread ${threadName}")
    }
  }
  Thread.sleep(1000)
}
