package section1.code3

import kotlin.concurrent.thread

fun main() {
    println("[${Thread.currentThread().name}] 시작")
    thread {
        println("[${Thread.currentThread().name}] 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 종료")
    }
    Thread.sleep(1000L)
    println("[${Thread.currentThread().name}] 종료")
}
