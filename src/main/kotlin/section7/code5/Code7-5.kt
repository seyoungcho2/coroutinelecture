package section7.code5

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val runBlockingJob = coroutineContext[Job]
  println(runBlockingJob?.parent)
}