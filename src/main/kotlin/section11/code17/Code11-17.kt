package section11.code17

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  println("작업1")
  launch {
    println("작업2")
  }
  println("작업3")
}