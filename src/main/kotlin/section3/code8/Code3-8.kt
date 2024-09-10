package section3.code8

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Main) {
        println("[${Thread.currentThread().name}] 작업 실행")
    }
}
