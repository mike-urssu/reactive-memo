package com.project.memo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveMemoApplication

fun main(args: Array<String>) {
    runApplication<ReactiveMemoApplication>(*args)
}
