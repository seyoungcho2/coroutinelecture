package section6.code5

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

val myJob = Job()
val coroutineContext: CoroutineContext = Dispatchers.Default + myJob
