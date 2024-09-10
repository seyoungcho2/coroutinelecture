package section5.code14

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val networkDeferred1: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        "결과값1" // 결과값 반환
    }
    val networkDeferred2: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        "결과값2" // 결과값 반환
    }

    val results: List<String> = awaitAll(networkDeferred1, networkDeferred2)
    println("[${Thread.currentThread().name}] ${results.joinToString(", ")}") // 결과값 출력
}