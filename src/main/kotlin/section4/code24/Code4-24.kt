package section4.code24

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val job: Job = launch {
    delay(1000L)
  }
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