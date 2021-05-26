package com.example.demo

import com.hello.service.ConsoleHelloService
import com.hello.service.HelloService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

	@Bean
	fun helloService(): HelloService {
		return ConsoleHelloService()
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}