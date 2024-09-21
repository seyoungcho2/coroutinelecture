package section10.code3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  repeat(10) { repeatTime ->
    launch {
      delay(1000L) // 1초 동안 코루틴 일시 중단
      println("[${getElapsedTime(startTime)}] 코루틴${repeatTime} 실행 완료")
    }
  }
}

fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"
