package section11.code11

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val job = launch(start = CoroutineStart.ATOMIC) {
    println("작업1")
  }
  job.cancel() // 생성 상태의 코루틴에 취소 요청
  println("작업2")
}