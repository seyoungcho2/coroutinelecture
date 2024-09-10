package section4.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val immediateJob: Job = launch {
    println("[${getElapsedTime(startTime)}] launch 코루틴 실행")
  }
}

fun getElapsedTime(startTime: Long): String =
  "지난 시간: ${System.currentTimeMillis() - startTime}밀리초"