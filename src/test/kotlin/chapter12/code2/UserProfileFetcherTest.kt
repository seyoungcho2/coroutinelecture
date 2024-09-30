package chapter12.code2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import section12.code2.UserProfileFetcher

class UserProfileFetcherTest {
  @Test
  fun `UserNameRepository가 적절한 유저 프로필을 반환한다`() {
    // Given
    val userProfileFetcher = UserProfileFetcher(
      userNameRepository = StubUserNameRepository(
        userNameMap = mapOf<String, String>(
          "0x1111" to "홍길동",
          "0x2222" to "조세영"
        )
      ),
      userPhoneNumberRepository = FakeUserPhoneNumberRepository().apply {
        this.saveUserPhoneNumber("0x1111", "010-xxxx-xxxx")
      }
    )

    // When
    val userProfile = userProfileFetcher.getUserProfileById("0x1111")

    // Then
    assertEquals("홍길동", userProfile.name)
    assertEquals("010-xxxx-xxxx", userProfile.phoneNumber)
  }
}