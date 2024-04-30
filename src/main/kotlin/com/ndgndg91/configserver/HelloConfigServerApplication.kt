package com.ndgndg91.configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloConfigServerApplication

fun main(args: Array<String>) {
    runApplication<HelloConfigServerApplication>(*args)
}
