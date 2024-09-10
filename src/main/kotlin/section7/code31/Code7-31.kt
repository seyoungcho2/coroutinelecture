package section7.code31

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  delay(5000L)
  println("[${Thread.currentThread().name}] 코루틴 종료")
}