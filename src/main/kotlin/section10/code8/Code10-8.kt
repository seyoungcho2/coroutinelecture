package section10.code8

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val dispatcher = newFixedThreadPoolContext(2, "Thread")
  launch(dispatcher) {
    repeat(5) {
      println("[${Thread.currentThread().name}] 스레드를 점유한채로 100밀리초간 대기합니다")
      Thread.sleep(100L)
      println("[${Thread.currentThread().name}] 점유한 스레드에서 마저 실행됩니다")
    }
  }
}