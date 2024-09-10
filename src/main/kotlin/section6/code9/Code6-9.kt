package section6.code9

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main() = runBlocking<Unit> {
  val coroutineName = CoroutineName("MyCoroutine")
  val dispatcher = Dispatchers.IO
  val myJob = Job()
  val coroutineContext: CoroutineContext = coroutineName + dispatcher + myJob

  val deletedCoroutineContext = coroutineContext.minusKey(CoroutineName)

  println(deletedCoroutineContext)
}
