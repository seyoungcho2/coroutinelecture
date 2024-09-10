package section1.code2

class ExampleThread : Thread() {
    override fun run() {
        println("[${Thread.currentThread().name}] 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 종료")
    }
}

fun main() {
    println("[${Thread.currentThread().name}] 시작")
    ExampleThread().start()
    Thread.sleep(1000L)
    println("[${Thread.currentThread().name}] 종료")
}


