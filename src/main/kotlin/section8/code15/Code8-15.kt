package section8.code15

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  supervisorScope {
    val deferred: Deferred<String> = async(CoroutineName("Coroutine1")) {
      throw Exception("Coroutine1에 예외가 발생했습니다")
    }
    try {
      deferred.await()
    } catch (e: Exception) {
      println("[노출된 예외] ${e.message}")
    }
  }
}