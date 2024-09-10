package section3.code3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 작업1 실행")
    }
    launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 작업2 실행")
    }
    launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 작업3 실행")
    }
}

