package section7.code13

import kotlinx.coroutines.*

fun main() {
    val newScope = CoroutineScope(CoroutineName("MyCoroutine") + Dispatchers.IO)
    newScope.launch(context = CoroutineName("LaunchCoroutine")) {
        println("newScope의 coroutineContext: ${newScope.coroutineContext}")
        println("launch 코루틴의 coroutineContext: ${this.coroutineContext}")
        println("launch 코루틴의 parentJob: ${this.coroutineContext[Job]?.parent}")
    }
    Thread.sleep(1000L)
}