package section3.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val imageProcessingDispatcher = Dispatchers.Default.limitedParallelism(2)
    repeat(1000) {
        launch(imageProcessingDispatcher) {
            Thread.sleep(1000L) // 이미지 처리 작업
            println("[${Thread.currentThread().name}] 이미지 처리 완료")
        }
    }
}
