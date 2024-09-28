package section11.code14

import kotlinx.coroutines.*

fun main() = runBlocking<Unit>(Dispatchers.IO) {
  println("runBlocking 코루틴 실행 스레드: ${Thread.currentThread().name}")
  launch(Dispatchers.Unconfined) {
    println("launch 코루틴 실행 스레드: ${Thread.currentThread().name}")
  }
}