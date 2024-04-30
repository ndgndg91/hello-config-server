package com.ndgndg91.configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class HelloConfigServerApplication

fun main(args: Array<String>) {
    runApplication<HelloConfigServerApplication>(*args)
}
