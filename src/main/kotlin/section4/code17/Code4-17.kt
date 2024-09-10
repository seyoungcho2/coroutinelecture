package section4.code17

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.Default) {
        while(this.isActive) {
            println("작업 중")
        }
    }
    delay(100L)
    whileJob.cancel()
}