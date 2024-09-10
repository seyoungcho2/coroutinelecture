package section7.code16

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  this.launch {
    this.async {
      // 작업 실행
    }
  }
}