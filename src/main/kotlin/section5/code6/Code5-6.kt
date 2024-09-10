package section5.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val networkDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L)
        return@async "Dummy Response"
    }
    networkDeferred.join()
    printJobState(job = networkDeferred)
}

private fun printJobState(job: Job) {
    println(
        "Job State\n" +
                "isActive >> ${job.isActive}\n" +
                "isCancelled >> ${job.isCancelled}\n" +
                "isCompleted >> ${job.isCompleted} "
    )
}