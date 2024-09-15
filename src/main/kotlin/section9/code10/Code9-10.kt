package section9.code10

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val results = searchByKeyword("Keyword") // 검색 실행 및 결과 값 반환 받기
  println("[결과] ${results.toList()}") // 결과값 출력
  println(getElapsedTime(startTime))
}

suspend fun searchByKeyword(keyword: String): Array<String> = coroutineScope {
  val dbResultsDeferred = async {
    searchFromDB(keyword)
  }
  val serverResultsDeferred = async {
    searchFromServer(keyword)
  }

  return@coroutineScope arrayOf(*dbResultsDeferred.await(), *serverResultsDeferred.await())
}

suspend fun searchFromDB(keyword: String): Array<String> {
  delay(1000L)
  return arrayOf("[DB]${keyword}1", "[DB]${keyword}2")
}

suspend fun searchFromServer(keyword: String): Array<String> {
  delay(1000L)
  return arrayOf("[Server]${keyword}1", "[Server]${keyword}2")
}

fun getElapsedTime(startTime: Long): String = "지난 시간: ${System.currentTimeMillis() - startTime}ms"
