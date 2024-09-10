package section4.code1

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val job: Job = launch {
        println("[${Thread.currentThread().name}] 실행")
    }
}