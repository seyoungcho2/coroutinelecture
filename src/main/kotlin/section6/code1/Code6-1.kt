package section6.code1

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineName: CoroutineName = CoroutineName("코루틴 이름 설정")
    val dispatcher: CoroutineDispatcher = Dispatchers.IO
    val job: Job = Job()
    val coroutineExceptionHandler: CoroutineExceptionHandler = CoroutineExceptionHandler(
        handler = { coroutineContext, throwable ->
            // 예외 처리
        }
    )
}