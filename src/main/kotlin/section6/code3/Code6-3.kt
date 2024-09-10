package section6.code3

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
fun main() = runBlocking<Unit> {
    val coroutineContext = newSingleThreadContext("MyThread") + CoroutineName("MyCoroutine")
    val newCoroutineContext = coroutineContext + CoroutineName("NewCoroutine")

    launch(context = newCoroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}