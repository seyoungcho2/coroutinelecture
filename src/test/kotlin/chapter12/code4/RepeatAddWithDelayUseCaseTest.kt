package chapter12.code4

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import section12.code4.RepeatAddWithDelayUseCase

class RepeatAddWithDelayUseCaseTest {
  @Test
  fun `runBlocking_100번 더하면 100이 반환된다`() = runBlocking {
    // Given
    val repeatAddUseCase = RepeatAddWithDelayUseCase()

    // When
    val result = repeatAddUseCase.add(repeatTime = 100)

    // Then
    assertEquals(100, result)
  }
}
