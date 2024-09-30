package chapter12.code7

import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import section12.code7.StringStateHolder


class StringStateHolderTestFail {
  @Test
  fun `updateStringWithDelay(ABC)가 호출되면 문자열이 ABC로 변경된다`() = runTest {
    // Given
    val stringStateHolder = StringStateHolder()

    // When
    stringStateHolder.updateStringWithDelay("ABC")

    // Then
    advanceUntilIdle()
    assertEquals("ABC", stringStateHolder.stringState)
  }
}