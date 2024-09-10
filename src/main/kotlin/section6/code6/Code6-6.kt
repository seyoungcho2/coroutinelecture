package section6.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val coroutineContext = CoroutineName("MyCoroutine") + Dispatchers.IO
  val nameFromContext = coroutineContext[CoroutineName.Key]
  println(nameFromContext)
}