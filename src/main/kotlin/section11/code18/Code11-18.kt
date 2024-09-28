package section11.code18

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch(Dispatchers.Unconfined) {
    println("[Dispatchers.Unconfined] 시작 스레드: ${Thread.currentThread().name}")
    delay(100L)
    println("[Dispatchers.Unconfined] 재개 스레드: ${Thread.currentThread().name}")
  }
}