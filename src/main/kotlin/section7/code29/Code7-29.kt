package section7.code29

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch(CoroutineName("Coroutine1")) {
    val coroutine1Job = this.coroutineContext[Job] // Coroutine1의 Job
    val newJob = Job(parent = coroutine1Job)
    launch(CoroutineName("Coroutine2") + newJob) {
      delay(100L)
      println("[${Thread.currentThread().name}] 코루틴 실행")
    }
  }
}