package section4.code8

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val lazyJob: Job = launch(start = CoroutineStart.LAZY) {
    println("[${getElapsedTime(startTime)}] launch 코루틴 지연 실행")
  }
  delay(3000L) // 3000밀리초간 대기
  lazyJob.start() // 코루틴 실행 lazyJob.join()을 호출해도 실행됨
}


fun getElapsedTime(startTime: Long): String =
  "지난 시간: ${System.currentTimeMillis() - startTime}밀리초"