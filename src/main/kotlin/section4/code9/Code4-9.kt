package section4.code9

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val longJob: Job = launch(Dispatchers.Default) {
        repeat(10) { repeatTime ->
            delay(1000L) // 1000밀리초 대기
            println("[${getElapsedTime(startTime)}] 반복횟수 ${repeatTime}")
        }
    }
}

fun getElapsedTime(startTime: Long): String =
    "지난 시간: ${System.currentTimeMillis() - startTime}밀리초"