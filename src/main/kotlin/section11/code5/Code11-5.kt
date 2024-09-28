package section11.code5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.locks.ReentrantLock

var count = 0
val reentrantLock = ReentrantLock()

fun main() = runBlocking<Unit> {
  withContext(Dispatchers.Default) {
    repeat(10_000) {
      launch {
        reentrantLock.lock()
        count += 1
        reentrantLock.unlock()
      }
    }
  }
  println("count = ${count}")
}