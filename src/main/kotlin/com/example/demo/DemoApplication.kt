package com.example.demo

import com.hello.service.ConsoleHelloService
import com.hello.service.HelloService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

//@SpringBootApplication
@ComponentScan
@Configuration
class DemoApplication {
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}