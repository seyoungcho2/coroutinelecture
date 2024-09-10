package section7.code10

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val parentJob = launch { // 부모 코루틴 생성
    launch { // 자식 코루틴 생성
      delay(1000L) // 1초간 대기
      println("[${getElapsedTime(startTime)}] 자식 코루틴 실행 완료")
    }
    println("[${getElapsedTime(startTime)}] 부모 코루틴이 실행하는 마지막 코드")
  }
  parentJob.invokeOnCompletion { // 부모 코루틴이 종료될 시 호출되는 콜백 등록
    println("[${getElapsedTime(startTime)}] 부모 코루틴 실행 완료")
  }
  delay(500L) // 500밀리초간 대기
  println(parentJob) // parentJob Debug String 출력
  printJobState(parentJob) // parentJob 상태 출력
}

private fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"

private fun printJobState(job: Job) {
  println(
    "Job State\n" +
            "isActive >> ${job.isActive}\n" +
            "isCancelled >> ${job.isCancelled}\n" +
            "isCompleted >> ${job.isCompleted} "
  )
}