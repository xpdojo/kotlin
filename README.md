# Kotlin

## 설치

```sh
sdk list kotlin
// 1.7.10 ...
sdk install kotlin 1.7.10
```

```sh
kotlin -version
// Kotlin version 1.7.10-release-333 (JRE 11.0.16+8-post-Ubuntu-0ubuntu122.04)
```

## 실행

Gradle과 같은 빌드 도구 없이 스크립트를 실행할 수 있다.

```kotlin
// assert.kts
val a = 1
val b = 2
assert(a != b)
```

```sh
kotlinc -script assert.kts
```

## 참조

- [Kotlin command-line compiler: Run scripts](https://kotlinlang.org/docs/command-line.html#run-scripts) - Kotlin 공식 문서
