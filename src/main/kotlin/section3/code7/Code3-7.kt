package section3.code7

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dedicatedDispatcher = Dispatchers.IO.limitedParallelism(2)
    repeat(100) {
        launch(dedicatedDispatcher) {
            println("[${Thread.currentThread().name}] 중요 작업 실행")
        }
    }
}
