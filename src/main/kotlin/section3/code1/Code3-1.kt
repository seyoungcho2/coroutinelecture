package section3.code1

import kotlinx.coroutines.*

val singleThreadDispatcher: CoroutineDispatcher =
    newSingleThreadContext("SingleThread")

fun main() = runBlocking<Unit> {
    launch(singleThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}