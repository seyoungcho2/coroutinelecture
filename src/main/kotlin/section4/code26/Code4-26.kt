package section4.code26

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val whileJob: Job = launch(Dispatchers.IO) {
    while(true){
      // 작업 실행
    }
  }
  whileJob.cancel() // 코루틴 취소 요청
  println(whileJob)
  printJobState(whileJob)
}

private fun printJobState(job: Job) {
  println(
    "Job State\n" +
            "isActive >> ${job.isActive}\n" +
            "isCancelled >> ${job.isCancelled}\n" +
            "isCompleted >> ${job.isCompleted} "
  )
}