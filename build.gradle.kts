plugins {
    kotlin("jvm") version "2.0.0"
}

group = "info.coroutine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // 코루틴 라이브러리
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")

    // JUnit5 테스트 프레임워크
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.1")

    // 코루틴 테스트 라이브러리
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}