package section9.code5

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val job1 = launch {
    delayAndPrintHelloWorld()
  }
  val job2 = launch {
    delayAndPrintHelloWorld()
  }
  joinAll(job1, job2)
  println(getElapsedTime(startTime))
}

suspend fun delayAndPrintHelloWorld() {
  delay(1000L)
  println("Hello World")
}

private fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"