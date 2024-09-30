package chapter12.code1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import section12.code1.AddUseCase

class AddUseCaseTest {
  @Test
  fun `1,2,3을 더하면 6이다`() {
    val addUseCase: AddUseCase = AddUseCase()
    val result = addUseCase.add(1, 2, 3)
    assertEquals(6, result)
  }

  @Test
  fun `실패하는 테스트_1,2,3을 더하면 5이다`() {
    val addUseCase: AddUseCase = AddUseCase()
    val result = addUseCase.add(1, 2, 3)
    assertEquals(5, result)
  }
}
