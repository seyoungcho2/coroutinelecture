package section7.code32

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch {
    delay(1000L)
    println("[${Thread.currentThread().name}] launch 코루틴 종료")
  }
  delay(2000L)
  println("[${Thread.currentThread().name}] runBlocking 코루틴 종료")
}

