package section6.code4

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineContext1 = CoroutineName("MyCoroutine1") + newSingleThreadContext("MyThread1")
    val coroutineContext2 = CoroutineName("MyCoroutine2") + newSingleThreadContext("MyThread2")
    val combinedCoroutineContext = coroutineContext1 + coroutineContext2
    
    launch(context = combinedCoroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}