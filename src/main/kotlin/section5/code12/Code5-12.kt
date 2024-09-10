package section5.code12

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val result: String = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        println("[${Thread.currentThread().name}] 결과값이 반환됩니다")
        "결과값" // 결과값 반환
    }.await()
    println("[${Thread.currentThread().name}] $result") // 결과값 출력
}