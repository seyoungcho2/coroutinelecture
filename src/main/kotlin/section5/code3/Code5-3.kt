package section5.code3
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val networkDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        return@async "Dummy Response" // 결과값 반환
    }
    val result = networkDeferred.await() // networkDeferred로부터 결과값이 반환될 때까지 runBlocking 일시 중단
    println(result) // Dummy Response 출력
}