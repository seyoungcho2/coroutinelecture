package section4.code16

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.Default) {
        while(true) {
            println("작업 중")
            yield()
        }
    }
    delay(100L)
    whileJob.cancel()
}