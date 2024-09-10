package section5.code13

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val result1: String = withContext(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        "결과값1" // 결과값 반환
    }
    val result2: String = withContext(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        "결과값1" // 결과값 반환
    }

    val results = listOf(result1, result2)
    println("[${Thread.currentThread().name}] ${results.joinToString(", ")}") // 결과값 출력
}