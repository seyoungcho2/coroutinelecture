package section6.code7

import kotlinx.coroutines.*

@OptIn(ExperimentalStdlibApi::class)
fun main() = runBlocking<Unit> {
  val coroutineContext = CoroutineName("MyCoroutine") + Dispatchers.IO
  val nameFromContext = coroutineContext[CoroutineDispatcher] // '.Key'제거
  println(nameFromContext)
}