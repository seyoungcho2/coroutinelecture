package section5.code15

import kotlinx.coroutines.*

private val myDispatcher1 = newSingleThreadContext("MyThread1")
private val myDispatcher2 = newSingleThreadContext("MyThread2")

fun main() = runBlocking<Unit> {
    println("[${Thread.currentThread().name}] 코루틴 실행1")
    withContext(myDispatcher1) {
        println("[${Thread.currentThread().name}] 코루틴 실행2")
        withContext(myDispatcher2) {
            println("[${Thread.currentThread().name}] 코루틴 실행3")
        }
        println("[${Thread.currentThread().name}] 코루틴 실행4")
    }
    println("[${Thread.currentThread().name}] 코루틴 실행5")
}