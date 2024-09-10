package section4.code20

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val job: Job = launch {
    delay(1000L)
  }
  job.join() // launch 코루틴이 실행 완료될때까지 일시 중단
  println(job)
}