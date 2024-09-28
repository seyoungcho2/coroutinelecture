package section11.code12

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch(start = CoroutineStart.UNDISPATCHED) {
    println("작업1")
  }
  println("작업2")
}