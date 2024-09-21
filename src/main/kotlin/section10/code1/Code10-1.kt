package section10.code1


fun routine() {
  routineA() // routineA는 routine의 서브루틴
  routineB() // routineB는 routine의 서브루틴
}

fun routineA() {
  routineB() // routineB는 routineA의 서브루틴
}

fun routineB() {
  // 작업 실행
}