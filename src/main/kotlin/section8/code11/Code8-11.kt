package section8.code11

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
    println("[예외 발생] ${throwable}")
  }
  val exceptionHandler2 = CoroutineExceptionHandler { coroutineContext, throwable ->
    println("[예외 발생2] ${throwable}")
  }

  CoroutineScope(exceptionHandler)
    .launch(CoroutineName("Coroutine1") + exceptionHandler2) {
      launch(CoroutineName("Coroutine2")) {
        throw Exception("Coroutine2에 예외가 발생했습니다")
      }
    }
  delay(1000L)
}
