package section2.code2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    println("[${Thread.currentThread().name}] runBlocking 코루틴 시작")
    launch {
        println("[${Thread.currentThread().name}] launch 코루틴 시작")
        delay(500L)
        println("[${Thread.currentThread().name}] launch 코루틴 종료")
    }
    delay(1000L)
    println("[${Thread.currentThread().name}] runBlocking 코루틴 종료")
}
