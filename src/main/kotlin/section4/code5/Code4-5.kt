package section4.code5

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val convertImageJob1: Job = launch(Dispatchers.Default) {
        Thread.sleep(1000L) // 이미지1 변환 작업 실행
        println("[${Thread.currentThread().name}] 이미지1 변환 완료")
    }
    val convertImageJob2: Job = launch(Dispatchers.Default) {
        Thread.sleep(1000L) // 이미지2 변환 작업 실행
        println("[${Thread.currentThread().name}] 이미지2 변환 완료")
    }

    joinAll(convertImageJob1, convertImageJob2) // 이미지 1,2가 모두 변환될 때까지 대기

    listOf(convertImageJob1, convertImageJob2).joinAll()

    val uploadImageJob: Job = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 이미지1,2 업로드")
    }
}