package section8.code3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val parentJob = launch(CoroutineName("Parent Coroutine")) {
    // 새로운 Job 객체를 만들어 Coroutine1에 연결
    launch(CoroutineName("Coroutine1") + Job()) {
      launch(CoroutineName("Coroutine3")) {
        delay(100L)
        println("[${Thread.currentThread().name}] 코루틴 실행")
      }
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행")
    }
    launch(CoroutineName("Coroutine2")) {
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행")
    }
  }
  delay(20L) // 코루틴들이 모두 생성될 때까지 대기
  parentJob.cancel() // Parent Coroutine에 취소 요청
  delay(1000L)
}