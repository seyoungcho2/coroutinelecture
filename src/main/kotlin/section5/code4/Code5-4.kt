package section5.code4

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val networkDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L)
        return@async "Dummy Response"
    }
    networkDeferred.join() // networkDeferred가 완료될 때까지 runBlocking 일시 중단
}