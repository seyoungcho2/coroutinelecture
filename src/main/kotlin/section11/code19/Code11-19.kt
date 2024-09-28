package section11.code19

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch(start = CoroutineStart.UNDISPATCHED) {
    println("[CoroutineStart.UNDISPATCHED] 시작 스레드: ${Thread.currentThread().name}")
    delay(100L)
    println("[CoroutineStart.UNDISPATCHED] 재개 스레드: ${Thread.currentThread().name}")
  }
}