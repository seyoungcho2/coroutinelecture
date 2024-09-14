package section8.code2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch(CoroutineName("Parent Coroutine")) {
    // 새로운 Job 객체를 만들어 Coroutine1에 연결
    launch(CoroutineName("Coroutine1") + Job()) {
      launch(CoroutineName("Coroutine3")) {
        throw Exception("예외 발생")
      }
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행")
    }
    launch(CoroutineName("Coroutine2")) {
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행")
    }
  }
  delay(1000L)
}