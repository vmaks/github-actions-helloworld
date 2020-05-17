package com.maks.demoserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoServerApplication

fun main(args: Array<String>) {
	runApplication<DemoServerApplication>(*args)
}
