package section9.code7

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  delayAndPrint(keyword = "부모 코루틴이 실행 중입니다")
  launch {
    delayAndPrint(keyword = "자식 코루틴이 실행 중입니다")
  }
}

suspend fun delayAndPrint(keyword: String) {
  delay(1000L)
  println(keyword)
}
