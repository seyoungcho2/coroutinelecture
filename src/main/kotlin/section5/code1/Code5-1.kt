package section5.code1
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val networkDeferred = async(Dispatchers.IO) {
        delay(1000L) // 네트워크 요청
        return@async "Dummy Response" // Dummy Response 반환
    }
}