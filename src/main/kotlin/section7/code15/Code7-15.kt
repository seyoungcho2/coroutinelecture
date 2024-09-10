package section7.code15

import kotlinx.coroutines.*

fun main() {
  val newScope = CoroutineScope(CoroutineName("MyCoroutine") + Dispatchers.IO)
  newScope.launch(CoroutineName("LaunchCoroutine")) {
    launch { // CoroutineScope으로부터 LaunchCoroutine의 실행 환경을 제공 받아 코루틴 실행
      // 작업 실행
    }
  }
  Thread.sleep(1000L)
}