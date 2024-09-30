package chapter12.code6

import kotlinx.coroutines.delay
import section12.code6.Follower
import section12.code6.OfficialAccountRepository

class StubOfficialAccountRepository(
  private val users: List<Follower.OfficialAccount>
) : OfficialAccountRepository {
  override suspend fun searchByName(name: String): Array<Follower.OfficialAccount> {
    delay(1000L)
    return users.filter { user ->
      user.name.contains(name)
    }.toTypedArray()
  }
}