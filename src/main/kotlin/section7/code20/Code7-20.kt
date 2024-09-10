package section7.code20

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