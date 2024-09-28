package section11.code16

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  println("작업1")
  launch(Dispatchers.Unconfined) {
    println("작업2")
  }
  println("작업3")
}