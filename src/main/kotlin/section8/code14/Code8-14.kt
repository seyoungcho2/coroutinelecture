package section8.code14

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  try {
    launch(CoroutineName("Coroutine1")) {
      throw Exception("Coroutine1에 예외가 발생했습니다")
    }.join()
  } catch (e: Exception) {
    println(e.message)
  }
  launch(CoroutineName("Coroutine2")) {
    delay(100L)
    println("Coroutine2 실행 완료")
  }
}