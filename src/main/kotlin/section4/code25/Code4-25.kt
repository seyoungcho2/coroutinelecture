package section4.code25

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val job: Job = launch {
    delay(1000L)
  }
  job.join() // launch 코루틴이 실행 완료될때까지 일시 중단
  println(job)
  printJobState(job)
}


private fun printJobState(job: Job) {
  println(
    "Job State\n" +
            "isActive >> ${job.isActive}\n" +
            "isCancelled >> ${job.isCancelled}\n" +
            "isCompleted >> ${job.isCompleted} "
  )
}