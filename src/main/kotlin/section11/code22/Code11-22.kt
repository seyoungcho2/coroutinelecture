package section11.code22

import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

fun main() = runBlocking<Unit> {
  val result : Response = executeNetworkCall()
  println(result) // 코루틴 재개 시 반환 받은 결과 출력
}

suspend fun executeNetworkCall(): Response {
  return suspendCancellableCoroutine<Response> { continuation: CancellableContinuation<Response> ->
    executeNetworkCallAsync(
      onSuccess = {
        continuation.resume(Response.Success(it))
      },
      onFail = {
        continuation.resume(Response.Fail(it))
      }
    )
  }
}

sealed class Response() {
  data class Success(val string: String) : Response()
  data class Fail(val throwable: Throwable): Response()
}

fun executeNetworkCallAsync(onSuccess: (String) -> Unit, onFail: (Throwable) -> Unit) {
  // 네트워크 요청 실행
  onSuccess("네트워크 요청 성공")
}