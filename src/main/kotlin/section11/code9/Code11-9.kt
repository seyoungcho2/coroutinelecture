package section11.code9

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  launch {
    println("작업1")
  }
  println("작업2")
}