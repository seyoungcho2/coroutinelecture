package section1.code1

fun main() {
    println("[${Thread.currentThread().name}] 시작")
    Thread.sleep(1000L)
    println("[${Thread.currentThread().name}] 종료")
}