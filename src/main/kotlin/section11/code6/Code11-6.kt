package section11.code6

import kotlinx.coroutines.*

var count = 0
val countChangeDispatcher = newSingleThreadContext("전용 스레드")

fun main() = runBlocking<Unit> {
  withContext(Dispatchers.Default) {
    repeat(10_000) {
      launch(countChangeDispatcher) {
        count += 1
      }
    }
  }
  println("count = $count")
}
