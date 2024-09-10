package section5.code5

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val networkDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L)
        return@async "Dummy Response"
    }
    networkDeferred.cancel() // networkDeferred 코루틴 취소 요청
}