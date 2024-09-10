package section6.code2

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
fun main() = runBlocking<Unit> {
    val coroutineContext = newSingleThreadContext("MyThread") + CoroutineName("MyCoroutine")

    launch(context = coroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}