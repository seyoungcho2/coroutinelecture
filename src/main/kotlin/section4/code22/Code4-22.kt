package section4.code22

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val whileJob: Job = launch(Dispatchers.IO) {
    while(true){
      yield() // 스레드 양보(일시 중단)
    }
  }
  whileJob.cancelAndJoin() // 코루틴 취소 완료될때까지 대기
  println(whileJob)
}