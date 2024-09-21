package section10.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val job = launch {
    while (this.isActive) {
      println("작업 중")
    }
  }
  delay(100L) // 100밀리초간 일시 중단
  job.cancel() // 코루틴 취소
}