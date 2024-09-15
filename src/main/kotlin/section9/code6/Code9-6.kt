package section9.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val job1 = launch {
    delay(1000L)
    println("Hello World")
  }
  val job2 = launch {
    delay(1000L)
    println("Hello World")
  }
  joinAll(job1, job2)
  println(getElapsedTime(startTime))
}

fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"