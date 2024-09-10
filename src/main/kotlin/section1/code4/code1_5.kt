package section1.code4

import java.util.concurrent.Executors

fun main() {
    // ExecutorService 생성
    val executorService = Executors.newFixedThreadPool(2)

    // 작업1 제출
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업1 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}] 작업1 완료")
    }

    // 작업2 제출
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업2 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}] 작업2 완료")
    }

    // 작업3 제출
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업3 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}] 작업3 완료")
    }

    // ExecutorService 종료
    executorService.shutdown()
}
