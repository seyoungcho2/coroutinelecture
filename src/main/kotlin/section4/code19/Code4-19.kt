package section4.code19

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val job: Job = launch(start = CoroutineStart.LAZY) {
    delay(1000L)
  }
  println(job)
}