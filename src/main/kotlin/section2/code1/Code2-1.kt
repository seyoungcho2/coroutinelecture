package section2.code1

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    println("[${Thread.currentThread().name}] runBlocking 코루틴 시작")
    delay(1000L)
    println("[${Thread.currentThread().name}] runBlocking 코루틴 종료")
}