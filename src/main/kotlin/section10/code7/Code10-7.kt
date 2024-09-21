package section10.code7

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val dispatcher = newFixedThreadPoolContext(2, "Thread")
  launch(dispatcher) {
    repeat(5) {
      println("[${Thread.currentThread().name}] 코루틴 실행이 일시 중단 됩니다")
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행이 재개 됩니다")
    }
  }
}