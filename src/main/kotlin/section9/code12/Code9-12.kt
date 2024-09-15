package section9.code12

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val startTime = System.currentTimeMillis()
  val results = searchByKeyword("Keyword") // 검색 실행 및 결과 값 반환 받기
  println("[결과] ${results.toList()}") // 결과값 출력
  println(section9.code11.getElapsedTime(startTime))
}

suspend fun searchByKeyword(keyword: String): Array<String> = supervisorScope {
  val dbResultsDeferred = async {
    throw Exception("DB 읽기 오류 발생")
    searchFromDB(keyword)
  }
  val serverResultsDeferred = async {
    searchFromServer(keyword)
  }

  val dbResults = try {
    dbResultsDeferred.await()
  } catch (e: Exception) {
    arrayOf() // 예외 발생 시 빈 결과 반환
  }

  val serverResults = try {
    serverResultsDeferred.await()
  } catch (e: Exception) {
    arrayOf() // 예외 발생 시 빈 결과 반환
  }

  return@supervisorScope arrayOf(*dbResults, *serverResults)
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