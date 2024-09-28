package section11.code20

fun main() {
  println("[${Thread.currentThread().name}] 작업 시작")
  Thread.sleep(1000L)
  println("[${Thread.currentThread().name}] 작업 종료")
}
