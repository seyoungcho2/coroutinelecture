package section4.code13

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val longJob: Job = launch(Dispatchers.Default) {
        delay(1000L)
        println("longJob 코루틴의 동작")
    }
    longJob.cancelAndJoin() // longJob 취소 요청 후 취소 완료될 때까지 호출 코루틴 일시 중단
    executeAfterJobCancelled() // 취소 후 실행돼야 하는 동작
}

fun executeAfterJobCancelled() {
    println("longJob 코루틴 취소 후 실행돼야 하는 동작")
}