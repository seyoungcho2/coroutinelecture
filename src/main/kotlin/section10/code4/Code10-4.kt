package section10.code4

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  repeat(10) { repeatTime ->
    launch {
      Thread.sleep(1000L) // 1초 동안 스레드 블로킹(코루틴의 스레드 점유 유지)
      println("[${getElapsedTime(startTime)}] 코루틴${repeatTime} 실행 완료")
    }
  }
}

fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"