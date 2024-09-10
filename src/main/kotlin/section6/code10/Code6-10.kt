package section6.code10

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main() = runBlocking<Unit> {
  val coroutineName = CoroutineName("MyCoroutine")
  val dispatcher = Dispatchers.IO
  val job = Job()
  val coroutineContext: CoroutineContext = coroutineName + dispatcher + job

  val deletedCoroutineContext = coroutineContext.minusKey(CoroutineName)

  println("coroutineContext: $coroutineContext")
  println("deletedCoroutineContext: $deletedCoroutineContext")
}