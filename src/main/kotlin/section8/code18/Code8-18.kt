package section8.code18

import kotlinx.coroutines.*

fun main() = runBlocking<Unit>(CoroutineName("runBlocking 코루틴")) {
  launch(CoroutineName("Coroutine1")) {
    launch(CoroutineName("Coroutine2")) {
      throw CancellationException()
    }
    delay(100L)
    println("[${Thread.currentThread().name}] 코루틴 실행")
  }
  delay(100L)
  println("[${Thread.currentThread().name}] 코루틴 실행")
}