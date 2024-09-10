package section4.code4

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

    convertImageJob1.join() // 이미지 1이 변환될 때까지 대기
    convertImageJob2.join() // 이미지 2가 변환될 때까지 대기

    val uploadImageJob: Job = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 이미지1,2 업로드")
    }
}