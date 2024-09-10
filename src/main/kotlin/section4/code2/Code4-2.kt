package section4.code2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val updateTokenJob = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 토큰 업데이트 시작")
        delay(100L) // 새로운 토큰을 가져오는데 걸리는 시간
        println("[${Thread.currentThread().name}] 토큰 업데이트 완료")
    }

    val networkCallJob = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 네트워크 요청")
    }
}