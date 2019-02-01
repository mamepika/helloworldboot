package com.sample.example.helloworldboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloworldbootApplication

fun main(args: Array<String>) {
	runApplication<HelloworldbootApplication>(*args)
}

