package section5.code11

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val result: String = withContext(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        println("[${Thread.currentThread().name}] 결과값이 반환됩니다")
        return@withContext "결과값" // 결과값 반환
    }
    println("[${Thread.currentThread().name}] $result") // 결과값 출력
}