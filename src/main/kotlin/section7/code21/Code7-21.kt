package section7.code21

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> { // 루트 코루틴(루트 Job) 생성
  println("[${Thread.currentThread().name}] 코루틴 실행")
}